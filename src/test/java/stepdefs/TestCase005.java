package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.TestCase002.*;

public class TestCase005 {
    @When("Click login bank manager.")
    public void clickLoginBankManager() {
        HomePage.managerButton();
    }

    @And("Select customer options.")
    public void selectCustomerOptions() {
        ManagerBankPage.customerButton();
    }

    @And("Enter a random First name.")
    public void enterARandomFirstName() {
        ManagerBankPage.name();
    }

    @And("Enter a random Last Name.")
    public void enterARandomLastName() {
        ManagerBankPage.rename();
    }

    @And("Enter a random Post Code.")
    public void enterARandomPostCode() {
        ManagerBankPage.code();
    }

    @And("Click add customer.")
    public void clickAddCustomer() {
        ManagerBankPage.addCustomer();
    }

    @And("Confirm the alert.")
    public void confirmTheAlert() {
        ManagerBankPage.clickAlert();
    }

    @And("Go to open an account.")
    public void goToOpenAnAccount() {
        ManagerBankPage.openAccount();
    }

    @And("Select a new user from the list.")
    public void selectANewUserFromTheList() {
        ManagerBankPage.checkNewUser();

    }

    @And("Select the dollar currency from the list.")
    public void selectTheDollarCurrencyFromTheList() {
        ManagerBankPage.checkDollar();

    }

    @And("Click Process")
    public void clickProcess() {
        ManagerBankPage.clickButtonProcess();

    }

    @And("Confirm the alert2.")
    public void confirmTheAlert2() {
        ManagerBankPage.clickAlert2();
    }

    @And("Click the HOME button.")
    public void clickTheHOMEButton() { HomePage.homeButton();

    }

    @And("Click customer login.")
    public void clickCustomerLogin() {HomePage.firstButton();

    }

    @And("Select a new user.")
    public void selectANewUser() {ManagerBankPage.checkNewUser();

    }

    @And("Click login.")
    public void clickLogin() {
        SelectionPage.iClickButton();

    }

    @And("Confirm the dollar currency.")
    public void confirmTheDollarCurrency() {
        AccountPage.typeAccount();
        AccountPage.accountBalance();

    }

    @And("Select deposit.")
    public void selectDeposit() {AccountPage.depositMoney();

    }

    @And("Enter X amount.")
    public void enterXAmount() {AccountPage.payMoney();

    }

    @And("Click d deposit.")
    public void clickDdeposit() {AccountPage.goWithdraw();

    }

    @And("Check account balance after transaction.")
    public void checkAccountBalanceAfterTransaction() {AccountPage.checkResult();

    }

    @And("Select transactions.")
    public void selectTransactions() {AccountPage.iClickTransaction();

    }

    @Then("Confirm payment list.")
    public void confirmPaymentList() {
        TransactionPage.iCheckTransaction();
    }
}
