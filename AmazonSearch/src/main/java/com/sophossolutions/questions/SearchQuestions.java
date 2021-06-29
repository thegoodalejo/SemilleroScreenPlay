package com.sophossolutions.questions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.task.SearchTask;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class SearchQuestions implements Question<String>
{
	private Target strNombreProducto;
	private Target strPrecioProducto;

	public SearchQuestions(Target strNombreProducto, Target strPrecioProducto)
	{
		this.strNombreProducto = strNombreProducto;
		this.strPrecioProducto = strPrecioProducto;
	}
	
	
	@Override
	public String answeredBy(Actor actor)
	{
		String nombreProducto= "Nombre: " + Text.of(strNombreProducto).viewedBy(actor).asString()+ ",";
		String precioProducto;
		
		try {

			precioProducto= " Precio: " + Text.of(strPrecioProducto).viewedBy(actor).asString()+ ".";
		}
		catch(Exception e)
		{
			precioProducto= " Articulo agotado";
		}
		
		System.out.println(nombreProducto + precioProducto);
		return "Ok";
		}
	
	public static SearchQuestions showResults(Target strNombreProducto, Target strPrecioProducto)
	{
		return new SearchQuestions(strNombreProducto, strPrecioProducto);
	}

}
