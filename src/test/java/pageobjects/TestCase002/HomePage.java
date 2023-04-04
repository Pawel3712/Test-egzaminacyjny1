package pageobjects.TestCase002;

import static drivers.DriverFactory.*;
import static helpers.CommonUtils.click;
import static helpers.CommonUtils.isDisplayed;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static selectors.TestCase002.HomePageSelectors.*;


public class HomePage {
   public static void openHomePage(){
      getDriver().get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
      assertEquals("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login", getDriver().getCurrentUrl());
   }

   public static void firstButton() {
      click(CUSTOMER_LOGIN_BUTTON);
      assertEquals("Customer Login", getDriver().findElement(CUSTOMER_LOGIN_BUTTON).getText());
   }
   public static void managerButton(){
    assertTrue(isDisplayed(BANK_MANAGER_BUTTON));
      click(BANK_MANAGER_BUTTON);
   }
public static void homeButton(){
      assertTrue(isDisplayed(HOME_BUTTON));
      click(HOME_BUTTON);

}
   }
