package selectors.TestCase002;

import org.openqa.selenium.By;

public class HomePageSelectors {

    public static By HOME_BUTTON = By.xpath("//button[@class='btn home']");

    public static By CUSTOMER_LOGIN_BUTTON = By.xpath("//button[@ng-click='customer()']");
    public static By BANK_MANAGER_BUTTON = By.xpath("//button[@ng-click='manager()']");

}
