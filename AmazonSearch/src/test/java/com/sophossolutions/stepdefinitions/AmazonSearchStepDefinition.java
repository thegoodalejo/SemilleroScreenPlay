package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import com.sophossolutions.task.SearchTask;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AmazonSearchStepDefinition
{
	/*@Given("{string} desea ir a la pagina de {string}")
	public void deseaIrALaPaginaDe(String strUrl)
	{
		System.out.println("@GIVEN");
		theActorCalled("julian Rodriguez").wasAbleTo(Open.url(strUrl));
	}

	@When("Ingresa nombre de usuario {string} y password {string}")
	public void ingresaNombreDeUsuarioYPassword(String strUser, String strPassword)
	{
		System.out.println("@WHEN");
		theActorCalled("julian Rodriguez").wasAbleTo(SearchTask.withCredentials(strUser, strPassword));
	}

	@Then("Valida que el titulo sea {string}")
	public void validaQueElTituloSea(String string)
	{
		System.out.println("@THEN");
		theActorInTheSpotlight().should(seeThat(Result.in(string)));
	}
	
	@Before
	public void setup()
	{
		setTheStage(new OnlineCast());
	} */
	
	@Given("Deseo ir a la pagina de {string}")
	public void deseoIrALaPaginaDe(String strUrl) {
		theActorCalled("Grupo Uno").wasAbleTo(Open.url(strUrl));
	}

	@When("Ingreso el producto {string}")
	public void ingresoElProducto(String strProducto) {
		theActorCalled("Grupo Uno").wasAbleTo(SearchTask.product(strProducto));
	}

	@Then("Imprimo los tres articulos con sus precios")
	public void imprimoLosTresArticulosConSusPrecios() {
		System.out.println("@THEN");
	}
	
	
	@Before
	public void setup()
	{
		setTheStage(new OnlineCast());
	} 
}