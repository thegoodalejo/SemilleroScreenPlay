package com.sophos.semillero.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class HomePageMercado {
	public static final Target BARRA_BUSQUEDA = Target.the("Campo barra de busqueda").locatedBy("//input[@class='nav-search-input']");
	public static final Target BTN_BUSQUEDA = Target.the("Boton de busqueda").locatedBy("//button[@type='submit']");

}
