package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.*;

public class TestCase001 {

    @Given("I open shop website")
    public void iOpenShopWebsite(){
        ShopHomePage.openShopHomePage();
    }
    @When("I open first category")
    public void iOpenFirstCategory() {
        ShopHomePage.openCategory(1);
    }
    @And("I choose second product")
    public void iChooseSecondProduct() {
        CategoryPage.openProductSite(2);
    }
    @And("I click Add to basket button")
    public void iClickAddToBasketButton() {
        ProductPage.addToBasket();
    }
    @And("I click check a basket")
    public void iClickCheckABasket() {
        ProductPage.checkBasket();
    }
    @Then("I see my product in basket")
    public void iSeeMyProductInBasket() {
        BasketPage.assertBasketProduct();
    }
    @And("Go to payment")
    public void goToPayment() {
        BasketPage.toPayment();
    }
    @And("Enter your first and last name")
    public void enterYourFirstAndLastName() {
        PaymentDetailsPage.firstName();
        PaymentDetailsPage.lastName();
    }
    @And("Check Selected Country")
    public void checkSelectedCountry() {
        PaymentDetailsPage.checkCountry(1);
    }
    @And("Complete the address fields")
    public void completeTheAddressFields() {
        PaymentDetailsPage.fillAddres();
        PaymentDetailsPage.fillCode();
        PaymentDetailsPage.enterCity();
    }

    @And("Add phone number")
    public void addPhoneNumber() {
        PaymentDetailsPage.enterPhone();
    }

    @And("Add email")
    public void addEmail() {
        PaymentDetailsPage.fillEmail();
    }

    @And("Click buy and pay")
    public void clickBuyAndPay() {
        PaymentDetailsPage.clickBuyAndPay();
    }
    @Then("Confirm the order placed")
    public void confirmTheOrderPlaced() {
        PaymentDetailsPage.confirmOrder();
    }
}
