package co.com.tcs.certification.retotuya.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterForm extends PageObject {

    public static final Target CLICK_CONTACT=Target.the("Click in contact")
            .located(By.xpath("//a[contains(text(),'Contact')]"));

    public static final Target TXT_CONTACTEMAIL=Target.the("Add contact email")
            .located(By.xpath("//input[@id='recipient-email']"));

    public static final Target TXT_CONTACTNAME=Target.the("Add contact name")
            .located(By.xpath("//input[@id='recipient-name']"));

    public static final Target TXT_MESSAGE=Target.the("Add message")
            .located(By.xpath("//textarea[@id='message-text']"));

    public static final Target BTN_SENDMESSAGE=Target.the("Click in contact")
            .located(By.xpath("//button[contains(text(),'Send message')]"));
}
