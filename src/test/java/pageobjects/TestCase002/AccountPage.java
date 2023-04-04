package pageobjects.TestCase002;

import static drivers.DriverFactory.*;
import static helpers.CommonUtils.*;
import static org.junit.Assert.assertTrue;
import static selectors.TestCase002.AccountPageSelectors.*;


public class AccountPage {
    public static void typeAccount() {
        assertTrue(isDisplayed(ACCOUNT_CURRENCY));
        String CURRENT_CURRENCY = getDriver().findElement(ACCOUNT_CURRENCY).getText();
        System.out.println("Current currency: " + CURRENT_CURRENCY);
    }

    public static void accountBalance() {
        assertTrue(isDisplayed(ACCOUNT_BALANCE));
        String CURRENT_BALANCE = getDriver().findElement(ACCOUNT_BALANCE).getText();
        System.out.println("Balance account: " + CURRENT_BALANCE);
    }

    public static void withdrawMoney() {
        assertTrue(isDisplayed(WITHDRAW_BUTTON));
        click(WITHDRAW_BUTTON);
    }

    public static void allMoney() {
        click(WITHDRAW_AMOUNT_FIELD);
        String AMOUNT_BALANCE = getDriver().findElement(ACCOUNT_BALANCE).getText();
        type(WITHDRAW_AMOUNT_FIELD, AMOUNT_BALANCE);
    }

    public static void goWithdraw() {
        assertTrue(isDisplayed(PAY_OUT));
        click(PAY_OUT);
    }

    public static void result() {
        String TRANSACTION = getDriver().findElement(FIRST_ANNOUNCEMENT).getText();
        System.out.println("Transaction result " + TRANSACTION);
    }

    public static void checkResult() {
        String CURRENT_BALANCE = getDriver().findElement(ACCOUNT_BALANCE).getText();
        System.out.println("Balance account after transaction: " + CURRENT_BALANCE);
    }

    public static void typeAccountUser2() {
        assertTrue(isDisplayed(ACCOUNT_CURRENCY));
        String CURRENT_CURRENCY = getDriver().findElement(ACCOUNT_CURRENCY).getText();
        System.out.println("First current currency: " + CURRENT_CURRENCY);
        click(ACCOUNT_LIST);
        click(FUND);
        String CURRENT__CURRENCY = getDriver().findElement(ACCOUNT_CURRENCY).getText();
        System.out.println("Second current currency: " + CURRENT__CURRENCY);
    }

    public static void depositMoney() {
        assertTrue(isDisplayed(DEPOSIT_BUTTON));
        click(DEPOSIT_BUTTON);
    }

    public static void payMoney() {
        click(WITHDRAW_AMOUNT_FIELD);
        type(WITHDRAW_AMOUNT_FIELD, getRandomNumber(6));
    }

    public static void typeAccountUser3() {
        assertTrue(isDisplayed(ACCOUNT_CURRENCY));
        String CURRENT_CURRENCY = getDriver().findElement(ACCOUNT_CURRENCY).getText();
        System.out.println("First current currency: " + CURRENT_CURRENCY);
        click(ACCOUNT_LIST);
        click(RUPEE);
        String CURRENT__CURRENCY = getDriver().findElement(ACCOUNT_CURRENCY).getText();
        System.out.println("Second current currency: " + CURRENT__CURRENCY);
    }

    public static void withdrawMoney_a() {
        click(WITHDRAW_AMOUNT_FIELD);
        type(WITHDRAW_AMOUNT_FIELD, getRandomNumber(6));
    }

    public static void iClickTransaction() {
        assertTrue(isDisplayed(TRANSACTIONS_BUTTON));
        click(TRANSACTIONS_BUTTON);
    }

    public static void iCloseTheBrowser() {
        getDriver().quit();
    }
}