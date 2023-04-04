package helpers;

import org.openqa.selenium.By;
import java.text.DecimalFormat;
import java.time.Duration;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static drivers.DriverFactory.getDriver;

public class CommonUtils {
    public static WebDriverWait getWait() {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(35));
    }
    public static void click(By locator){
        getWait().until(ExpectedConditions.elementToBeClickable(locator)).click();
    }
    public static void type(By locator,String text){
        getDriver().findElement(locator).sendKeys(text);}
    public static void fileUpload(By locator,String FilePatch){
        getDriver().findElement(locator).sendKeys(FilePatch);
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
    public static boolean isDisplayed(By locator){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed();
    }
    public static boolean isEnabled(By locator){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator)).isEnabled();
    }
    public static void typeIfEmptyInput(By locator, String text){
        if(getDriver().findElement(locator).getAttribute("value").isEmpty()){
            type(locator, text);
        }
    }
    public static void clearAndTypeIfNotEmptyInput(By locator, String text){
        if(!getDriver().findElement(locator).getAttribute("value").isEmpty()){
            getDriver().findElement(locator).clear();
            type(locator, text);
        }
    }
}
