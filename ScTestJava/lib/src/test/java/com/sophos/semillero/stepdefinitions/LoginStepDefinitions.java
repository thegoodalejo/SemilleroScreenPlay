package com.sophos.semillero.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import com.sophos.semillero.tasks.Login;

public class LoginStepDefinitions {

	@Given("Deseo ir a la pagina de {string}")
	public void deseoIrALaPaginaDe(String strUrl) {
	    theActorCalled("Juan Miguel").wasAbleTo(Open.url(strUrl));
	}

	@When("Ingreso nombre de usuario {string} y password {string}")
	public void ingresoNombreDeUsuarioYPassword(String strUser, String strPassword) {
		theActorCalled("Juan Miguel").wasAbleTo(Login.withCredential(strUser, strPassword));
	}

	@Then("Valido que el tiitulo sea {string}")
	public void validoQueElTiituloSea(String string) {
	    System.out.println("Then");
	}
	
	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}
	
}
