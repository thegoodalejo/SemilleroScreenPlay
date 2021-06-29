package com.guacha.ui;

import java.util.List;

import org.openqa.selenium.NoSuchElementException;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;

public class AmazonResultsPage {
	
	private static final String ELEMENT_SELECTOR = "//div[@data-cel-widget and contains(@data-component-type, 's-search-result')][%d]";
	private static final String TITLE_AMEND = "//span/div//div[@class='sg-row'][2]//h2//span";
	private static final String WHOLE_PRICE_AMEND = "//span[@class='a-price-whole'][1]";
	private static final String FRAC_PRICE_AMEND = "//span[@class='a-price-fraction'][1]";	
	private static final Target RESULTS = Target.the("Search results").locatedBy("//div[@data-cel-widget and contains(@data-component-type, 's-search-result')]//span/div//div[@class='sg-row'][2]//h2//span"); 
	
	public static int getElementCount(Actor a) {
		return RESULTS.resolveAllFor(a).size();
	}

	public static void getElementTitle(Actor actor) {
		int elementsInPage = getElementCount(actor);
		
		for (int i = 1; i <= elementsInPage; i++) {
			
			String elementTitle = Target.the("Element " + i + " title")
					.locatedBy(String.format(ELEMENT_SELECTOR, i) + TITLE_AMEND)
					.resolveFor(actor)
					.getText();
			
			String elementPrice;
			try {
				elementPrice = Target.the("Element " + i + " price")
						.locatedBy(String.format(ELEMENT_SELECTOR, i) + WHOLE_PRICE_AMEND)
						.resolveFor(actor)
						.getText();
				
				elementPrice += "." + Target.the("Element " + i + " price")
				.locatedBy(String.format(ELEMENT_SELECTOR, i) + FRAC_PRICE_AMEND)
				.resolveFor(actor)
				.getText();
				
			} catch(NoSuchElementException e) {
				elementPrice = "No disponible";
			}
			System.out.println("\n-------------------------------------------------------------------------------------\n");
			System.out.println(elementTitle);
			System.out.println("Precio del artículo: $" + elementPrice);
			
		}
	}
	
}
