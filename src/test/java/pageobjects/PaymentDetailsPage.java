package pageobjects;

import org.openqa.selenium.By;

import static drivers.DriverFactory.driver;
import static helpers.CommonUtils.*;
import static selectors.TestCase001.PaymentDetailsPageSelectors.*;
import static strings.TestCase001.TestCase001Strings.*;

public class PaymentDetailsPage {
    public static void firstName() {
        isDisplayed(FIRST_NAME);
        typeIfEmptyInput(FIRST_NAME,NAME);
    }

    public static void lastName() {
        isDisplayed(LAST_NAME);
        typeIfEmptyInput(LAST_NAME,SURNAME);
    }
    public static void checkCountry(int number){
        isDisplayed(By.xpath("(//span[@id='select2-billing_country-container' or @title='Polska'])[" + number + "]"));
        if (isDisplayed(By.xpath("(//span[@id='select2-billing_country-container' or @title='Polska'])[" + number + "]"))) {
            System.out.println("Selected Country: Polska");
        }
    }
public static void fillAddres(){
        isDisplayed(ADDRES);
        typeIfEmptyInput(ADDRES,STREAT);
}

    public static void fillCode() {
        isDisplayed(CODE);
        typeIfEmptyInput(CODE,POSTCODE);
    }
    public static void enterCity(){
        isDisplayed(CITY_SELECTOR);
        typeIfEmptyInput(CITY_SELECTOR,CITY);
    }
    public static void enterPhone(){
        isDisplayed(PHONE_NUMBER_SELECTOR);
        typeIfEmptyInput(PHONE_NUMBER_SELECTOR,PHONE_NUMBER);
    }
    public static void fillEmail(){
        isDisplayed(E_MAIL);
        typeIfEmptyInput(E_MAIL,MAILADDERS);
    }
    public static void clickBuyAndPay(){
        isDisplayed(BUY_AND_PAY_BUTTON);
        click(BUY_AND_PAY_BUTTON);
    }
    public static void confirmOrder(){
        isDisplayed(ORDER_PLACED);
        if(isDisplayed(ORDER_PLACED)){
            driver.findElement(ORDER_PLACED).getText();
        } else System.out.println("Error: Something went wrong!");
    }
}
