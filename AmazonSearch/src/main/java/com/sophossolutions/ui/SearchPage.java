package com.sophossolutions.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class SearchPage
{
	public static final Target TXT_SEARCH = Target.the("Campo de busqueda de producto").located(By.name("field-keywords"));
	public static final Target BTN_SEARCH = Target.the("Botón de busqueda").located(By.id("nav-search-submit-button"));
}