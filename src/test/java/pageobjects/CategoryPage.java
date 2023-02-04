package pageobjects;

import org.openqa.selenium.By;

import static drivers.DriverFactory.driver;
import static helpers.CommonUtils.*;
import static org.junit.Assert.assertEquals;

public class CategoryPage {

    public static void openProductSite(int number) {
        String PRODUCT_URL= getHref(By.xpath("(//a[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link'])[" + number + "]"));
        driver.get(PRODUCT_URL);
        assertEquals(PRODUCT_URL,driver.getCurrentUrl());
    }


}
