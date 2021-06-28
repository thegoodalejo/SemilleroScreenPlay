package com.sophos.semillero.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ResultPage {	
	public static final Target TXT_PRODUCTO1 = Target.the("Nombre del producto uno").locatedBy("//ol/li[{0}]/div/div/div[2]/div[1]/a/h2");
	public static final Target TXT_PRECIO1 = Target.the("Precio del producto").locatedBy("//ol/li[{0}]/div/div/div[2]/div[2]/div[1]/div[1]/div/div/span[1]");
}
