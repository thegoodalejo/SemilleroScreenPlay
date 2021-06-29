package com.sophos.semillero.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophos.semillero.questions.Result;
import com.sophos.semillero.tasks.Login;
import com.sophos.semillero.ui.HomePage;

public class LoginStepDefinitions {
	@Given("Deseo ir a la pagina de {string}")
	public void deseoIrALaPaginaDe(String strUrl) {
	    theActorCalled("Juan Carlos").wasAbleTo(Open.url(strUrl));
	}

	@When("Ingreso nombre de usuario {string} y password {string}")
	public void ingresoNombreDeUsuarioYPassword(String strUser, String strPassword) {
		theActorCalled("Juan Carlos").wasAbleTo(Login.withCredential(strUser, strPassword));
	}

	@Then("Valido que el titulo sea {string}")
	public void validoQueElTiituloSea(String strTitle) {
	    theActorInTheSpotlight().should(seeThat(Result.in(HomePage.TXT_WELCOME_MSG), IsEqual.equalTo(strTitle)));
	}
	
	@Before("")
	public void setup() {
		setTheStage(new OnlineCast());
	}
}
