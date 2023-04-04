package stepdefs;

import io.cucumber.java.en.And;
import pageobjects.TestCase002.AccountPage;
import pageobjects.TestCase002.SelectionPage;

public class TestCase003 {

    @And("I choose Harry Potter from the list.")
    public void iChooseHarryPotterFromTheList() {
        SelectionPage.secondUser();
    }

    @And("I check if I'm on a pound account, if not, I change to it.")
    public void iCheckIfIHaveSelectedAPoundAccount() {
        AccountPage.typeAccountUser2();
    }

    @And("I choose to deposit.")
    public void iChooseToDeposit() {
        AccountPage.depositMoney();
    }

    @And("I pay amount X.")
    public void iPayAmountX() {
        AccountPage.payMoney();
    }

    @And("Click deposit.")
    public void clickDeposit() {
        AccountPage.goWithdraw();
    }



}
