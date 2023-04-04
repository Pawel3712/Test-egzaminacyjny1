package pageobjects.TestCase002;

import static drivers.DriverFactory.*;
import static helpers.CommonUtils.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static selectors.TestCase002.SelectionPageSelectors.*;

public class SelectionPage {
    public static void firstUser(){
       click(USER_1);
       assertTrue(isDisplayed(USER_1));
    }
    public static void iClickButton(){
        click(LOGIN_BUTTON);
        assertTrue(isDisplayed(LOGIN_BUTTON));
    }
    public static void secondUser(){
        click(USER_2);
        assertEquals("Harry Potter",getDriver().findElement(USER_2).getText());
    }
    public static void thirdUser(){
        click(USER_3);
        assertEquals("Ron Weasly",getDriver().findElement(USER_3).getText());
    }
}
