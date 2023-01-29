package selectors.TestCase001;

import org.openqa.selenium.By;

public class PaymentDetailsPage {
   public static By FRIST_NAME= By.name("billing_first_name");
   public static By LAST_NAME= By.name("billing_last_name");
   public static By ADDRES= By.name("billing_address_1");
   public static By CODE= By.name("billing_postcode");
   public static By CITY_SELECTOR= By.name("billing_city");
   public static By PHONE_NUMBER_SELECTOR= By.name("billing_phone");
   public static By E_MAIL= By.name("billing_email");
   public static By BUY_AND_PAY_BUTTON= By.id("place_order");
   public static By ORDER_PLACED= By.xpath("//p[@class='woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received']");




   }
