package com.guacha.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class AmazonHome {
	
	public static final Target TXT_SEARCH_FIELD = Target.the("Amazon Search Bar").located(By.id("twotabsearchtextbox"));
	public static final Target BTN_SEARCH = Target.the("Amazon Search Button").located(By.id("nav-search-submit-button"));
	
}
