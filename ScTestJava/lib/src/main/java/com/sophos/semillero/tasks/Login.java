package com.sophos.semillero.tasks;

import com.sophos.semillero.ui.LoginPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

	private String strUser;
	private String strPassword;

	public Login(String strUser, String strPassword) {
		this.strUser = strUser;
		this.strPassword = strPassword;
	}
	public Login(String strUser, String strPassword, int x) {
		this.strUser = strUser;
		this.strPassword = strPassword;
		System.out.println("entero "+x);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(strUser).into(LoginPage.TXT_USER_NAME));

	}

	public static Login in(String strUser, String strPassword) {
		return Tasks.instrumented(Login.class, strUser, strPassword);
		
	}
	public static Login fornumber(int x) {
		return Tasks.instrumented(Login.class, "duvan", "123456",x);
		
	}

}