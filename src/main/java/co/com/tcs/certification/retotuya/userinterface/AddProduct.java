package co.com.tcs.certification.retotuya.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class AddProduct extends PageObject {

    public static final Target CLICK_LOGIN=Target.the("Click in log in")
            .located(By.xpath("//a[contains(text(),'Log in')]"));

    public static final Target TXT_USERNAME=Target.the("Add user name")
            .located(By.xpath("//input[@id='loginusername']"));

    public static final Target TXT_PASSWORD=Target.the("Add password")
            .located(By.xpath("//input[@id='loginpassword']"));

    public static final Target BTN_LOGIN=Target.the("Button log in")
            .located(By.xpath("//button[contains(text(),'Log in')]"));

    public static final Target CLICK_LAPTOPS =Target.the("Click in Laptops")
            .located(By.xpath("//a[@id='itemc'][2]"));

    public static final Target CLICK_MACBOOK =Target.the("Click in Macbook Pro")
            .located(By.xpath("//a[contains(text(),'MacBook Pro')]"));

    public static final Target BTN_ADDCART =Target.the("BTN add producto to cart")
            .located(By.xpath("//a[contains(text(),'Add to cart')]"));

    public static final Target CLICK_CART =Target.the("Click producto to cart")
            .located(By.xpath("//a[contains(text(),'Cart')]"));

    public static final Target QUESTIONS_CART =Target.the("Question producto to cart")
            .located(By.xpath("//td[contains(text(),'MacBook Pro')]"));

    public static final Target DELETE_PRODUCT =Target.the("Delete product of cart")
            .located(By.xpath("//a[contains(text(),'Delete')]"));


}
