package com.sophos.semillero.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophos.semillero.ui.HomePageMercado;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Busqueda implements Task{
	private String strArticulo;
	
	public Busqueda (String strArticulo) {
		
		this.strArticulo=strArticulo;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(strArticulo).into(HomePageMercado.BARRA_BUSQUEDA),
				Click.on(HomePageMercado.BTN_BUSQUEDA));
		
	}
	
	public static Busqueda in(String strArticulo) {
		return instrumented(Busqueda.class, strArticulo);
	}
}
