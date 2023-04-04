package selectors.TestCase002;

import org.openqa.selenium.By;

public class ManagerBankPageSelectors {
    public static By FIRST_NAME = By.xpath("//input[@placeholder='First Name']");
    public static By LAST_NAME = By.xpath("//input[@placeholder='Last Name']");
    public static By POST_CODE = By.xpath("//input[@placeholder='Post Code']");

    public static By BUTTON = By.xpath("//button[@type='submit']");
    public static By OPEN_ACCOUNT_BUTTON = By.xpath("//button[@ng-click='openAccount()']");

}
