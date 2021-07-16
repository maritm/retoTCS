package co.com.tcs.certification.retotuya.tasks;

import co.com.tcs.certification.retotuya.model.DataList;
import static co.com.tcs.certification.retotuya.util.Variables.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static co.com.tcs.certification.retotuya.userinterface.AddProduct.*;
import static co.com.tcs.certification.retotuya.userinterface.AuthenticationUser.QUESTION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddProduct implements Task {
    private List<DataList> datalists;

    public AddProduct(List<DataList> datalists) {
        this.datalists = datalists;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Map<String, Object> user = new HashMap<>();
        actor.attemptsTo(
                WaitUntil.the(CLICK_LOGIN, isVisible()),
                Click.on(CLICK_LOGIN),
                Enter.theValue(datalists.get(CERO).getUserName()).into(TXT_USERNAME),
                Enter.theValue(datalists.get(CERO).getPassword()).into(TXT_PASSWORD),
                Click.on(BTN_LOGIN)
        );
        actor.attemptsTo(
                WaitUntil.the(CLICK_LAPTOPS, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(CLICK_LAPTOPS),
                Scroll.to(CLICK_MACBOOK),
                Click.on(CLICK_MACBOOK),
                Click.on(BTN_ADDCART)
        );
        actor.attemptsTo(
                Click.on(CLICK_CART)
        );
        user.put("PRODUCT", Text.of(QUESTIONS_CART).viewedBy(actor).asString());
        DataList.setResponseCart(user);

        actor.attemptsTo(
                Click.on(DELETE_PRODUCT)
        );

    }

    public static AddProduct macbook(List<DataList> dataLists) {
        return Tasks.instrumented(AddProduct.class, dataLists);
    }
}
