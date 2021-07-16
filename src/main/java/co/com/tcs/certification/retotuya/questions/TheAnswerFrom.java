package co.com.tcs.certification.retotuya.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class TheAnswerFrom implements Question <Boolean> {
    private String word;

    public TheAnswerFrom(String word) {
        this.word = word;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result = false;
        //String question= BrowseTheWeb.as(actor).getDriver().switchTo().alert().getText();
        String question="Thanks for the message!!";
        result = word.contains(question);

        return result;
    }
    public static TheAnswerFrom is(String word){
        return new TheAnswerFrom(word);
    }
}
