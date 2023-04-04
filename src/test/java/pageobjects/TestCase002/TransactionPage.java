package pageobjects.TestCase002;

import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

import static drivers.DriverFactory.getDriver;
import static helpers.CommonUtils.click;
import static helpers.CommonUtils.getWait;
import static selectors.TestCase002.AccountPageSelectors.*;


public class TransactionPage {
    public static void iCheckTransaction() {
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        getDriver().navigate().refresh();
        click(TRANSACTIONS_BUTTON);
        getDriver().navigate().refresh();
        getWait().until(ExpectedConditions.visibilityOfElementLocated(TRANSACTION_DATE));
        String date = getDriver().findElement(TRANSACTION_DATE).getText();
        System.out.println("Deposit date" + date);
    }

}
