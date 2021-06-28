package com.sophos.semillero.tasks;

import com.sophos.semillero.ui.AliExpressHomePage;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static  net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class BuscarProducto implements Task{

	
	private String Producto;

	
	public BuscarProducto (String produc) {
		
		this.Producto = produc;
		
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(AliExpressHomePage.BTN_CERRAR_IMAG),
				Enter.theValue(Producto).into(AliExpressHomePage.TXT_NAME_PRODUCTO),Click.on(AliExpressHomePage.BTN_BUSCAR));
		
//		actor.attemptsTo(Enter.theValue(User).into(LoginPage.TXT_USER_NAME),
//				Enter.theValue(Password).into(LoginPage.TXT_PASSWORD),Click.on(LoginPage.BTN_LOGIN));
		
	}
	public static BuscarProducto in (String Produ) {
		return instrumented(BuscarProducto.class, Produ);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
