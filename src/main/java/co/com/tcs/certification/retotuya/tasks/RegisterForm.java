package co.com.tcs.certification.retotuya.tasks;

import co.com.tcs.certification.retotuya.model.DataList;
import static co.com.tcs.certification.retotuya.util.Variables.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.tcs.certification.retotuya.userinterface.AddProduct.CLICK_LAPTOPS;
import static co.com.tcs.certification.retotuya.userinterface.RegisterForm.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegisterForm implements Task {
    private List<DataList> datalists;
    public RegisterForm(List < DataList > datalists) { this.datalists = datalists;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CLICK_CONTACT),
                Enter.theValue(datalists.get(CERO).getContactEmail()).into(TXT_CONTACTEMAIL),
                Enter.theValue(datalists.get(CERO).getContactName()).into(TXT_CONTACTNAME),
                Enter.theValue(datalists.get(CERO).getMessage()).into(TXT_MESSAGE),
                Click.on(BTN_SENDMESSAGE),
                WaitUntil.the(CLICK_CONTACT, isVisible()).forNoMoreThan(30).seconds()
        );
    }
    public static RegisterForm ofContact(List<DataList> dataLists) {
        return Tasks.instrumented(RegisterForm.class, dataLists);
    }
}
