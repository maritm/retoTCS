package co.com.tcs.certification.retotuya.tasks;

import co.com.tcs.certification.retotuya.model.DataList;
import static co.com.tcs.certification.retotuya.util.Variables.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static co.com.tcs.certification.retotuya.userinterface.AuthenticationUser.*;
import static co.com.tcs.certification.retotuya.userinterface.RegisterUser.CLICK_SINGUP;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AuthenticactionUser implements Task {
    private List<DataList> datalists;
    public AuthenticactionUser(List < DataList > datalists) { this.datalists = datalists;
    }
    @Override

    public <T extends Actor> void performAs(T actor) {
        Map<String,Object> user=new HashMap<>();

        actor.attemptsTo(
                WaitUntil.the(CLICK_SINGUP,isVisible()).forNoMoreThan(30).seconds(),
                Click.on(CLICK_LOGIN),
                Enter.theValue(datalists.get(CERO).getUserName()).into(TXT_USERNAME),
                Enter.theValue(datalists.get(CERO).getPassword()).into(TXT_PASSWORD),
                Click.on(BTN_LOGIN));
        user.put("USERNAME",datalists.get(CERO).getUserName());
        DataList.setResponseUser(user);


    }
    public static AuthenticactionUser is(List<DataList> dataLists){
        return Tasks.instrumented(AuthenticactionUser.class,dataLists);
    }
}
