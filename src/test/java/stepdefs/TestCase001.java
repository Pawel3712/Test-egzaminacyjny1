package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.BasicProductSide;
import pageobjects.BasketPage;
import pageobjects.ProductPage;
import pageobjects.ShopHomePage;
import selectors.TestCase001.ProductPageSelectors;

public class TestCase001 {

    @Given("I open shop website")
    public void iOpenShopWebsite(){
        ShopHomePage.openShopHomePage();
    }
    @When("I open first category")
    public void iOpenFirstCategory() {
        ShopHomePage.selectFirsCategory(1);
    }
    @And("I choose second product")
    public void iChooseSecondProduct() {
        BasicProductSide.openBasicProductSide(2);
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
}
