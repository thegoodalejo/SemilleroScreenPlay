package com.sophossolutions.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class ResultsPage
{
	public static final Target NOMBRE_P1	 = Target.the("Nombre primer articulo").
			located(By.xpath("//span[@cel_widget_id = 'MAIN-SEARCH_RESULTS-1']//h2"));
	public static final Target NOMBRE_P2	 = Target.the("Nombre segundo articulo").
			located(By.xpath("//span[@cel_widget_id = 'MAIN-SEARCH_RESULTS-3']//h2"));
	public static final Target NOMBRE_P3	 = Target.the("Nombre tercer articulo").
			located(By.xpath("//span[@cel_widget_id = 'MAIN-SEARCH_RESULTS-4']//h2"));
	public static final Target PRECIO_P1	 = Target.the("Precio primer articulo").
			located(By.xpath("//span[@cel_widget_id = 'MAIN-SEARCH_RESULTS-1']//span[@class = 'a-price']"));
	public static final Target PRECIO_P2	 = Target.the("Precio primer articulo").
			located(By.xpath("//span[@cel_widget_id = 'MAIN-SEARCH_RESULTS-3']//span[@class = 'a-price']"));
	public static final Target PRECIO_P3	 = Target.the("Precio primer articulo").
			located(By.xpath("//span[@cel_widget_id = 'MAIN-SEARCH_RESULTS-4']//span[@class = 'a-price']"));
}