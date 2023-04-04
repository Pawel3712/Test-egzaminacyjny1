package stepdefs;

import io.cucumber.java.en.And;
import pageobjects.TestCase002.AccountPage;
import pageobjects.TestCase002.SelectionPage;

public class TestCase004 {

    @And("I choose Ron Weasley from the list.")
    public void iChooseRonWeasleyFromTheList() {
        SelectionPage.thirdUser();

    }
    @And("I check if I have selected a rupee account.")
    public void iCheckIfIHaveSelectedARupeeAccount() {AccountPage.typeAccountUser3();

    }
    @And("Withdraw amount X from your account.")
    public void withdrawAmountXFromYourAccount() {
        AccountPage.withdrawMoney_a();

    }
    @And("I confirm the withdrawal of funds.")
    public void iConfirmTheWithdrawalOfFunds() {
        AccountPage.result();
    }

}
