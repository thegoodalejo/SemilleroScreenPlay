package com.sophossolutions.questions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.task.SearchTask;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class SearchQuestions implements Question<String>
{
	private Target strObteniendo;
	
	public SearchQuestions(Target strObteniendo)
	{
		this.strObteniendo = strObteniendo;
	}
	
	@Override
	public String answeredBy(Actor actor)
	{
		return Text.of(strObteniendo).viewedBy(actor).asString();
	}
	
	public static SearchQuestions in(Target txt)
	{
		return new SearchQuestions(txt);
	}

}
