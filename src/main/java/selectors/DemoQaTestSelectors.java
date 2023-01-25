package selectors;

import org.openqa.selenium.By;

public class DemoQaTestSelectors {
    public static By FIRSTNAME= By.id("firstName");
    public static By LAST_NAME= By.id("lastName");
    public static By EMAIL= By.id("userEmail");
    public static By MALE= By.xpath("//label[@for='gender-radio-1']");
    public static By PHOHE_NUMBER= By.id("userNumber");
    public static By UPLOAD= By.id("uploadPicture");
    public static By SUBJECT= By.xpath("//div[@class =('subjects-auto-complete__control css-yk16xz-control')]");
    public static By MIESIAC= By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select/option[11]");



}