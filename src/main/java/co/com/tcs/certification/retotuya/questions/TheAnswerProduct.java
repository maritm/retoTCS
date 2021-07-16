package co.com.tcs.certification.retotuya.questions;

import co.com.tcs.certification.retotuya.model.DataList;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.tcs.certification.retotuya.userinterface.AddProduct.QUESTIONS_CART;

public class TheAnswerProduct implements Question<Boolean> {
    private String word;

    public TheAnswerProduct(String word) {
        this.word = word;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result = false;

        String question = DataList.getResponseCart().toString().substring(9).replace("}", "");
        result= word.contains(question);

        return result;
    }

    public static TheAnswerProduct is(String word){
        return new TheAnswerProduct(word);
    }
}
