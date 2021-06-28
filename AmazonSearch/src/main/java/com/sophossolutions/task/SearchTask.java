package com.sophossolutions.task;

import com.sophossolutions.ui.SearchPage;

import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SearchTask implements Task
{
	private String strUser;
	private String strPassword;
	
	public SearchTask(String strUser, String strPassword)
	{
		this.strUser = strUser;
		this.strPassword = strPassword;
	}
	
	public SearchTask(String strUser, String strPassword, int x)
	{
		this.strUser = strUser;
		this.strPassword = strPassword;
		System.out.println("numero " + x);
	}
	
	@Override
	public <T extends Actor> void performAs(T actor)
	{
		actor.attemptsTo(Enter.theValue(strUser).into(SearchPage.TXT_USER_NAME),
				Enter.theValue(strPassword).into(SearchPage.TXT_PASWORD),
				Click.on(SearchPage.BTN_LOGIN));
	}
	
	public static SearchTask withCredentials(String strUser, String strPassword)
	{
		return instrumented(SearchTask.class, strUser, strPassword); 
	}
	
	public static SearchTask fornumber(int x)
	{
		return instrumented(SearchTask.class, "Julian", "123456", x);
	}
}