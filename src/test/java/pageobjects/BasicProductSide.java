package pageobjects;

import org.openqa.selenium.By;

import static drivers.DriverFactory.driver;
import static helpers.CommonUtils.*;
import static org.junit.Assert.assertEquals;
import static selectors.TestCase001.ProductPageSelectors.CHECK_BASKET_SELECTOR;

public class BasicProductSide {

    public static void openBasicProductSide(int number) {
        String PRODUCT_URL= getHref(By.xpath("(//a[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link'])[" + number + "]"));
        driver.get(PRODUCT_URL);
        assertEquals(PRODUCT_URL,driver.getCurrentUrl());
    }


}
