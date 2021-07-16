package co.com.tcs.certification.retotuya.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class TheAnswer implements Question<Boolean> {
    boolean result=false;

    @Override

    public Boolean answeredBy(Actor actor) {
        String user_register="Sign up successful.";
        String text_alert= BrowseTheWeb.as(actor).getDriver().switchTo().alert().getText();
        result=user_register.contains(text_alert);

        return result;
    }


    public static TheAnswer is(){
        return new TheAnswer();

    }
}
