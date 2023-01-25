package pageobjects;

import org.openqa.selenium.By;

import static drivers.DriverFactory.driver;
import static helpers.CommonUtils.*;
import static org.junit.Assert.assertEquals;

public class ShopHomePage {

 public static void openShopHomePage() {
     driver.get("http://mqmvqjrcuo.cfolks.pl/blog/");
     assertEquals("http://mqmvqjrcuo.cfolks.pl/blog/", driver.getCurrentUrl());
 }

    public static void selectFirsCategory(int number) {
    String CATEGORY_URL= getHref(By.xpath("//li[contains(@class,'product-category product')]/a[" + number + "]"));
    driver.get(CATEGORY_URL);
        assertEquals(CATEGORY_URL,driver.getCurrentUrl());
    }
}
