package selectors.TestCase002;

import org.openqa.selenium.By;

public class AccountPageSelectors {
    public static By ACCOUNT_NUMBER = By.xpath("//strong[contains(@class,'ng-binding')][1]");
    public static By ACCOUNT_BALANCE = By.xpath("//strong[contains(@class,'ng-binding')][2]");
    public static By ACCOUNT_CURRENCY = By.xpath("//strong[contains(@class,'ng-binding')][3]");
    public static By WITHDRAW_BUTTON = By.xpath("//button[@class='btn btn-lg tab'][3]");
    public static By DEPOSIT_BUTTON = By.xpath("//button[@class='btn btn-lg tab'][2]");
    public static By TRANSACTIONS_BUTTON = By.xpath("//button[@class='btn btn-lg tab'][1]");
    public static By WITHDRAW_AMOUNT_FIELD = By.xpath("//input[@type='number']");
    public static By PAY_OUT = By.xpath("//button[@type='submit']");
    public static By FIRST_ANNOUNCEMENT = By.xpath("//span[@class='error ng-binding']");
    public static By ACCOUNT_LIST = By.xpath("//select[@id='accountSelect']");
    public static By FUND = By.xpath("//option[@value='number:1005']");
    public static By RUPEE = By.xpath("//option[@value='number:1009']");

    public static By PROCESS_BUTTON = By.xpath("//button[@type='submit']");
    public static By TRANSACTION_DATE= By.xpath("//td[@class='ng-binding'][1]");
}
