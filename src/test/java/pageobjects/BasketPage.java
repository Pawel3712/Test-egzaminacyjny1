package pageobjects;

import static drivers.DriverFactory.driver;
import static org.junit.Assert.assertTrue;
import static selectors.TestCase001.BasketPageSelectors.*;


public class BasketPage {
    public static void assertBasketProduct(){
        assertTrue(driver.findElement(PRODUCT_BASKET_LINK_SELECTOR).isDisplayed());
        if(driver.findElement(PRODUCT_BASKET_LINK_SELECTOR).isDisplayed()){
            System.out.println("Product Name: "+"Wartość poniżej 5000 zł netto");
        }
    }

    public static void toPayment() {
      assertTrue(driver.findElement(CLICK_GO_TO_PAYMENT).isDisplayed());
      driver.findElement(CLICK_GO_TO_PAYMENT).click();


    }
}
