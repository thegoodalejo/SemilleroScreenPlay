package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import com.sophossolutions.task.SearchTask;
import com.sophossolutions.ui.ResultsPage;
import com.sophossolutions.questions.SearchQuestions;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class AmazonSearchStepDefinition
{	
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
		theActorInTheSpotlight().should(seeThat(SearchQuestions.showResults(ResultsPage.NOMBRE_P1,ResultsPage.PRECIO_P1)));
		theActorInTheSpotlight().should(seeThat(SearchQuestions.showResults(ResultsPage.NOMBRE_P2,ResultsPage.PRECIO_P2)));
		theActorInTheSpotlight().should(seeThat(SearchQuestions.showResults(ResultsPage.NOMBRE_P3,ResultsPage.PRECIO_P3)));
	}
	
	
	@Before
	public void setup()
	{
		setTheStage(new OnlineCast());
	} 
}