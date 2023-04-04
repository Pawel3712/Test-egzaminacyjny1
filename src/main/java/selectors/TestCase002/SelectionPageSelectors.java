package selectors.TestCase002;

import org.openqa.selenium.By;

import static strings.TestCase002.TestCase002Strings.RANDOM_NAME;
import static strings.TestCase002.TestCase002Strings.RANDOM_RENAME;

public class SelectionPageSelectors {
    public static By USER_1 = By.xpath("//option[@value='1']");
    public static By USER_2 = By.xpath("//option[@value='2']");
    public static By USER_3 = By.xpath("//option[@value='3']");
    public static By LOGIN_BUTTON = By.xpath("//button[@class='btn btn-default']");
    public static By NEW_USER = By.xpath("//option[contains(text(),'" + RANDOM_NAME + " " + RANDOM_RENAME + "')]");
    public static By DOLLAR = By.xpath("//option[contains(@value,'Dollar')]");


}
