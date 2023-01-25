import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import static drivers.DriverFactory.driver;
import static helpers.CommonUtils.*;
import static org.junit.Assert.*;
import static selectors.SeleniumTestSelectors.CLICK_ON_ME;
import static selectors.SeleniumTestSelectors.FNAME;
import static strings.Strings.*;

public class SeleniumTest {
    @Test
    public void scenario1() {

//      1. Włącz przeglądarkę oraz wejdz na link.
//
//       skrót 10.System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
        driver.get(TEST_LINK);
        driver.manage().window().maximize();
        assertEquals(TEST_LINK, driver.getCurrentUrl());

//      2. Kliknij guzik "Kliknij mnie"
        assertTrue(driver.findElement(By.id("clickOnMe")).isDisplayed());
//       30. driver.findElement(By.id("clickOnMe")).click();
        click(CLICK_ON_ME);

//      3. Pobierz tekst i zamknij alert.
        Alert alert = driver.switchTo().alert();
        assertEquals("Hello world!", alert.getText());
//        System.out.println(alert.getText());
        alert.accept();

//      4. Wpisz w pierwszym polu tekstowym, tekst "Paweł"
        type(FNAME,"Paweł");
//      45.  driver.findElement(By.id("fname")).sendKeys("Paweł");

//      5. Odpal oraz zamknij pierwszy link dostępny na stronie.
        assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Visit')]")).isDisplayed());
        driver.findElement(By.xpath("//a[contains(text(),'Visit')]")).click();
        assertEquals("https://www.w3schools.com/", driver.getCurrentUrl());
        driver.navigate().back();
        assertEquals(TEST_LINK, driver.getCurrentUrl());

//      6. Odpal oraz zamknij drugi link dostępny na stronie.
        assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Iam')]")).isDisplayed());
        driver.findElement(By.xpath("//a[contains(text(),'Iam')]")).click();
        assertEquals("https://www.google.com/", driver.getCurrentUrl());
        driver.navigate().back();
        assertEquals(TEST_LINK, driver.getCurrentUrl());
    }

    @Test
    public void scenario2() {
//      1. Włącz przeglądarkę oraz wejdz na link.
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
        driver.get(TEST_LINK);
        driver.manage().window().maximize();
        assertEquals(TEST_LINK, driver.getCurrentUrl());

//      2. Wybierz ulubioną markę samochodu z listy.
        driver.findElement(By.xpath("//option[@value='saab']")).click();
        assertTrue(driver.findElement(By.xpath("//option[@value='saab']")).isDisplayed());

//      3. Potwiedz nieznajomość regulaminu
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        assertTrue(driver.findElement(By.xpath("//input[@type='checkbox']")).isDisplayed());

//      4. Wybierz swoją płeć.
        driver.findElement(By.xpath("//input[@value='male']")).click();
        assertTrue(driver.findElement(By.xpath("//input[@value='male']")).isDisplayed());

//      5. Wyczyść pole tekstowe oraz wpisz swoją nazwę użytkownia.
        driver.findElement(By.xpath("//input[@name='username']")).clear();
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Zbyniu");

//      6. Wyczyść pole tekstowe oraz wpisz swoje hasło.
        driver.findElement((By.xpath("//input[@name='password']"))).clear();
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Kasztelan");

//      7. Zamknij przeglądarkę.
        driver.quit();
    }
}