import org.junit.Test;
import static helpers.CommonUtils.*;
import static org.junit.Assert.assertEquals;
import static selectors.DemoQaTestSelectors.*;
import static strings.DemoQaTestStrings.*;
import static drivers.DriverFactory.driver;

public class DemoQaTest {
    @Test
    public void test1() {
        //1. Włącz przeglądarkę i wejdź w link
        driver.get(DEMO_URL);
        driver.manage().window().maximize();
        assertEquals(DEMO_URL, driver.getCurrentUrl());

        //2. Wpisz imię i nazwisko.
        type(FIRSTNAME,NAME);
        type(LAST_NAME, SURNAME);

        //3. Wpisz e-mail, wybierz płeć
        type(EMAIL,getRandomMail());
        click(MALE);

        //4. Wpisz numer telefonu
        //type (PHOHE_NUMBER,PHONENUMBER);
        type(PHOHE_NUMBER,getRandomPhone());

        //5. Wybierz datę 09.11.1993 z kalendarza
        //click(MIESIAC);

        //6. Wpisz ulubiony przedmiot.
        //click(SUBJECT);
        //type(SUBJECT,CITY);

        //7 Wgraj plik na stronę.
        fileUpload(UPLOAD,FILE);


    }

    }
