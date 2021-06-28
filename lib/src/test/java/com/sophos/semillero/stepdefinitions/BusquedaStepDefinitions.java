package com.sophos.semillero.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsAnything;

import com.sophos.semillero.questions.Result;
import com.sophos.semillero.tasks.Busqueda;
import com.sophos.semillero.tasks.PrintResult;
import com.sophos.semillero.ui.ResultPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.Text;

public class BusquedaStepDefinitions {
	
	Result resultado;

	@Given("Deseo ir a la pagina {string}")
	public void deseoIrALaPagina(String string) {
	   theActorCalled("Grupo 2").wasAbleTo(Open.url(string));
	}
	@When("Ingreso nombre de producto (.+)$")
	public void ingresoNombreDeProducto(String strProducto) {
		theActorCalled("Grupo 2").wasAbleTo(Busqueda.in(strProducto));
	}

	@Then("Muestro nombre y precio del producto {string}")
	public void muestroNombreYPrecioDelProducto(String strListNum) {
		
		String[] arrNum = strListNum.split(",");
		System.out.println("------------------------------------------------");
		for (int i=0; i<arrNum.length; i++) {
			theActorInTheSpotlight().wasAbleTo(PrintResult.in(ResultPage.TXT_PRODUCTO1.of(arrNum[i]),ResultPage.TXT_PRECIO1.of(arrNum[i])));
		}
		System.out.println("------------------------------------------------");
	}
	
	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}
	
}
