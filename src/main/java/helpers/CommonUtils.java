package helpers;

import org.openqa.selenium.By;
import java.text.DecimalFormat;
import java.time.Duration;

import static drivers.DriverFactory.driver;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtils {
    public static WebDriverWait getWait() {
        return new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    public static void click(By locator){
        driver.findElement(locator).click();
    }
    public static void type(By locator,String text){
        driver.findElement(locator).sendKeys(text);}
    public static void fileUpload(By locator,String FilePatch){
        driver.findElement(locator).sendKeys(FilePatch);
    }

    public static String getRandomNumberBetween(int min, int max) {
        DecimalFormat formatter = new DecimalFormat("#");
        return formatter.format(min + Math.floor(max - min) * Math.random());
    }
    public static String getRandomPhone(){
        return getRandomNumberBetween(10000000,999999999);
    }

    public static String getRandomMail(){
        return getRandomName(5) + "@gmail.com";
    }
    public static String getRandomName(int number) {
        return RandomStringUtils.randomAlphabetic(number).toLowerCase();
    }
    public static String getRandomNumber(int numberAmount){;
        return RandomStringUtils.randomNumeric(numberAmount);
    }
    public static String getHref(By locator){
        return getWait().until(ExpectedConditions.presenceOfElementLocated(locator)).getAttribute("href");
    }

}
