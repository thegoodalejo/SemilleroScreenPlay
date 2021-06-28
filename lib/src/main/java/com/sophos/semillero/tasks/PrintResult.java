package com.sophos.semillero.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophos.semillero.ui.HomePageMercado;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class PrintResult implements Task{
	private Target Articulo;
	private Target Precio;
	
	public PrintResult (Target strArticulo,Target strPrecio) {
		
		this.Articulo=strArticulo;
		this.Precio=strPrecio;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		System.out.println(Articulo.resolveFor(actor).getTextValue()+" "+Precio.resolveFor(actor).getTextValue());
	}
	
	public static PrintResult in(Target strArticulo,Target strPrecio) {
		return instrumented(PrintResult.class, strArticulo,strPrecio);
	}
}