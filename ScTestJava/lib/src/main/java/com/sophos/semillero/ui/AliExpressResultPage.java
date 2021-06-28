package com.sophos.semillero.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class AliExpressResultPage {

	public static final String strNombreArticulo = "//div[%s][@class='_1OUGS']//div[@class='_2mXVg _89Qo8']//a//span";
	public static final String strPrecioArticulo = "//div[%s][@class='_1OUGS']//div[@class='_12A8D']";
	
	public static final Target TXT_PRODUCTO1 = Target.the("El nombre del aticulo1").locatedBy("//div[%s][@class='_1OUGS']//div[@class='_2mXVg _89Qo8']//a//span");
	public static final Target TXT_PRECIO1 = Target.the("El precio del articulo1").located(By.xpath("//div[%s][@class='_1OUGS']//div[@class='_12A8D']"));
	
}
