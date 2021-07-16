package co.com.tcs.certification.retotuya.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AuthenticationUser extends PageObject {


    public static final Target CLICK_LOGIN=Target.the("Click in log in")
            .located(By.xpath("//a[contains(text(),'Log in')]"));

    public static final Target TXT_USERNAME=Target.the("Add user name")
            .located(By.xpath("//input[@id='loginusername']"));

    public static final Target TXT_PASSWORD=Target.the("Add password")
            .located(By.xpath("//input[@id='loginpassword']"));

    public static final Target BTN_LOGIN=Target.the("Button log in")
            .located(By.xpath("//button[contains(text(),'Log in')]"));

    public static final Target QUESTION=Target.the("Question for user in the authentication")
            .located(By.xpath("//a[@id='nameofuser']"));
}
