package com.guacha.stepdefs;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import com.guacha.tasks.Search;
import com.guacha.ui.AmazonResultsPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AmazonSearchStepDefinitions {

	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}	
	
	@Given("I have a product I want to search in Amazon.com")
	public void iHaveAProductIWantToSearchInAmazonCom() {
		theActorCalled("Julian").wasAbleTo(Open.url("https://amazon.com"));
	}
	
	@When("^I search for (.+)$")
	public void iSearchFor(String searchedProduct) {
		theActorCalled("Julian").wasAbleTo(Search.theItem(searchedProduct));
	}
	
	@Then("I should see search results with prices")
	public void iShouldSeeSearchResultsWithPrices() {
	    AmazonResultsPage.getElementTitle(theActorCalled("Julian"));
	}
}
