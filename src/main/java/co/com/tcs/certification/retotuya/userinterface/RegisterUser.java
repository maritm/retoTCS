package co.com.tcs.certification.retotuya.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterUser extends PageObject {

    public static final Target CLICK_SINGUP=Target.the("Click in sing up")
            .located(By.xpath("//a[contains(text(),'Sign up')]"));

    public static final Target TXT_USERNAME=Target.the("Add user name")
            .located(By.xpath("//input[@id='sign-username']"));

    public static final Target TXT_PASSWORD=Target.the("Add password")
            .located(By.xpath("//input[@id='sign-password']"));

    public static final Target BTN_SINGUP=Target.the("Click button in sing up")
            .located(By.xpath("//button[contains(text(),'Sign up')]"));
}
