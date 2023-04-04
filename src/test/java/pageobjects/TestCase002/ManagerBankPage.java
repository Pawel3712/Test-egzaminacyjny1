package pageobjects.TestCase002;

import org.openqa.selenium.Alert;

import static drivers.DriverFactory.*;
import static helpers.CommonUtils.*;
import static org.junit.Assert.assertTrue;
import static selectors.TestCase002.AccountPageSelectors.*;
import static selectors.TestCase002.ManagerBankPageSelectors.*;
import static selectors.TestCase002.SelectionPageSelectors.DOLLAR;
import static selectors.TestCase002.SelectionPageSelectors.NEW_USER;
import static strings.TestCase002.TestCase002Strings.*;

public class ManagerBankPage {
    public static void customerButton() {
        assertTrue(isDisplayed(TRANSACTIONS_BUTTON));
        click(TRANSACTIONS_BUTTON);
    }

    public static void name() {
        click(FIRST_NAME);
        type(FIRST_NAME, RANDOM_NAME);
        assertTrue(isDisplayed(FIRST_NAME));
    }

    public static void rename() {
        click(LAST_NAME);
        type(LAST_NAME, RANDOM_RENAME);
        assertTrue(isDisplayed(LAST_NAME));
    }

    public static void code() {
        click(POST_CODE);
        type(POST_CODE, getRandomNumber(5));
        assertTrue(isDisplayed(POST_CODE));
    }

    public static void addCustomer() {
        assertTrue(isDisplayed(BUTTON));
        click(BUTTON);

    }

    public static void clickAlert() {
        Alert account_created = getDriver().switchTo().alert();
        System.out.println(account_created.getText());
        account_created.accept();
    }

    public static void openAccount() {
        assertTrue(isDisplayed(OPEN_ACCOUNT_BUTTON));
        click(OPEN_ACCOUNT_BUTTON);
    }

    public static void checkNewUser() {
       assertTrue(isDisplayed(NEW_USER));
        click(NEW_USER);

    }

    public static void checkDollar() {
        assertTrue(isDisplayed(DOLLAR));
        click(DOLLAR);
    }

    public static void clickButtonProcess() {
        isDisplayed(PROCESS_BUTTON);
        click(PROCESS_BUTTON);
    }

    public static void clickAlert2() {
        Alert account_number = getDriver().switchTo().alert();
        System.out.println(account_number.getText());
        account_number.accept();
    }
}
