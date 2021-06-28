package com.sophos.semillero.questions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class Result implements Question<Boolean>{

	private Target NombreArticulo;
	private Target PrecioArticulo;
	
	public Result(Target nombrearticulo, Target precioarticulo) {
		this.NombreArticulo = nombrearticulo;
		this.PrecioArticulo = precioarticulo;
	}
	public Result(String nombrearticulo, String precioarticulo) {
		this.NombreArticulo = Target.the("El nombre del aticulo").locatedBy(nombrearticulo);
		this.PrecioArticulo = Target.the("El precio del articulo").located(By.xpath(precioarticulo));
	}
	@Override
	public Boolean answeredBy(Actor actor) {
		
		System.out.println(Text.of(NombreArticulo).viewedBy(actor).asString());
		System.out.println(Text.of(PrecioArticulo).viewedBy(actor).asString());
		return true;
	}
	
	public static Result  in(Target Nombrearticulo, Target Precioarticulo) {
		return new Result(Nombrearticulo,Precioarticulo);
	}
	public static Result  Resultados(String Nombrearticulo, String Precioarticulo) {
		return new Result(Nombrearticulo,Precioarticulo);
	}
	
}
