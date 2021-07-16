package co.com.tcs.certification.retotuya.questions;

import co.com.tcs.certification.retotuya.model.DataList;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.tcs.certification.retotuya.userinterface.AuthenticationUser.QUESTION;


public class TheAnswerAuth implements Question<Boolean> {

    boolean result=false;



    @Override
    public Boolean answeredBy(Actor actor) {
        String user_name= "Welcome "+DataList.getResponseUser().toString().substring(10).replace("}","");
        String question= Text.of(QUESTION).viewedBy(actor).asString();
        result=user_name.contains(question);



        return result;
    }

    public static TheAnswerAuth is(){
        return new TheAnswerAuth();
    }
}
