package com.guacha.tasks;

import com.guacha.ui.AmazonHome;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Search implements Task{
	
	private String searchedItem;
	
	public Search(String item) {
		this.searchedItem = item;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
					Enter.theValue(this.searchedItem).into(AmazonHome.TXT_SEARCH_FIELD),
					Click.on(AmazonHome.BTN_SEARCH)
				);	
	}
	
	public static Search theItem(String itemToSearch) {
		
		return instrumented(Search.class, itemToSearch);
		
	}
	
}
