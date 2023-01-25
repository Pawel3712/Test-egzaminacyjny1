package pageobjects;

import static drivers.DriverFactory.driver;
import static helpers.CommonUtils.click;
import static helpers.CommonUtils.getHref;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static selectors.TestCase001.ProductPageSelectors.*;
public class ProductPage {

    public static void addToBasket(){
        assertTrue(driver.findElement(ADD_TO_BASKET).isDisplayed());
        click(ADD_TO_BASKET);
    }
    public static void checkBasket(){
        String BASKET_URL= getHref(CHECK_BASKET_SELECTOR);
        driver.get(BASKET_URL);
        assertEquals(BASKET_URL,driver.getCurrentUrl());
    }
}
