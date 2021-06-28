package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class SearchPage
{
	public static final Target TXT_USER_NAME = Target.the("Campo nombre de usuario").locatedBy("name:uid");
	public static final Target TXT_PASWORD = Target.the("Campo contraseña de usuario").locatedBy("name");;
	public static final Target BTN_LOGIN = Target.the("Boton login").locatedBy("//*[@value = 'LOGIN']");
}