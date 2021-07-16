package co.com.tcs.certification.retotuya.tasks;

import static co.com.tcs.certification.retotuya.userinterface.RegisterUser.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.tcs.certification.retotuya.model.DataList;
import static co.com.tcs.certification.retotuya.util.Variables.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Random;


public class RegisterThe implements Task {
    private List <DataList> datalists;
    public RegisterThe(List<DataList> datalists) {
        this.datalists = datalists;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Random rnd=new Random();
        int name=(int )(Math.random()*100);
        String user_name=datalists.get(CERO).getUserName()+ String.valueOf(name);

        actor.attemptsTo(
                WaitUntil.the(CLICK_SINGUP,isVisible()).forNoMoreThan(30).seconds(),
                Click.on(CLICK_SINGUP),
                Enter.theValue(user_name).into(TXT_USERNAME),
                Enter.theValue(datalists.get(CERO).getPassword()).into(TXT_PASSWORD),
                Click.on(BTN_SINGUP)
        );
    }
    public static RegisterThe user(List<DataList> datalists){
        return Tasks.instrumented(RegisterThe.class,datalists);
    }
}
