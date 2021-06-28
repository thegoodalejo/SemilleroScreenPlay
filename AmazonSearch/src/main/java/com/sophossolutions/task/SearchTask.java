package com.sophossolutions.task;

import com.sophossolutions.ui.SearchPage;

import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SearchTask implements Task
{

	private String strSearch;
	
	public SearchTask(String strSearch)
	{
		this.strSearch = strSearch;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(strSearch).into(SearchPage.TXT_SEARCH),
				Click.on(SearchPage.BTN_SEARCH));
	}
	
	public static SearchTask product(String strSearch)
	{
		return instrumented(SearchTask.class, strSearch); 
	}
}