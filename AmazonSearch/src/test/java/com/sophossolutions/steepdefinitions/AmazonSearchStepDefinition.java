package com.sophossolutions.steepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.sophossolutions.questions.SearchQuestions;
import com.sophossolutions.task.SearchTask;

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
}