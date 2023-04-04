package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.TestCase002.AccountPage;
import pageobjects.TestCase002.HomePage;
import pageobjects.TestCase002.SelectionPage;


public class TestCase002 {
    @Given("I open the bank's home page.")
    public void iOpenTheBanksHomePage() {
        HomePage.openHomePage();
    }

    @When("I choose customer login.")
    public void iChooseCustomerLogin() {
        HomePage.firstButton();
    }

    @And("I choose Hermione Granger from the list.")
    public void iChooseHermioneGrangerFromTheList() {
        SelectionPage.firstUser();
    }

    @And("I click Login.")
    public void iClickLogin() {
        SelectionPage.iClickButton();
    }

    @And("I check if I have selected a dollar account.")
    public void iCheckIfIHaveSelectedADollarAccount() {
        AccountPage.typeAccount();
    }

    @And("I check account balance.")
    public void iCheckAccountBalance() {
        AccountPage.accountBalance();
    }

    @And("I choose to withdraw.")
    public void iChooseToWithdraw() {
        AccountPage.withdrawMoney();
    }

    @And("Enters the total amount of the account.")
    public void entersTheTotalAmountOfTheAccount() {
        AccountPage.allMoney();
    }

    @And("Click withdraw.")
    public void clickWithdraw() {
        AccountPage.goWithdraw();
    }

    @And("I confirm the payment of the amount.")
    public void iConfirmThePaymentOfTheAmount() {
        AccountPage.result();
    }

    @Then("I check account balance after transaction.")
    public void iCheckAccountBalanceAfterTransaction() {
        AccountPage.checkResult();
    }

    @Then("Close the browser.")
    public void closeTheBrowser() {AccountPage.iCloseTheBrowser();
    }
}
