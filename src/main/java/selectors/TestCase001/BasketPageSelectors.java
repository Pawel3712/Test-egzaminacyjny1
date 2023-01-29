package selectors.TestCase001;

import org.openqa.selenium.By;

public class BasketPageSelectors {
    public static By PRODUCT_BASKET_LINK_SELECTOR= By.xpath("//td[@class='product-name']/a");
    public static By CLICK_GO_TO_PAYMENT= By.xpath("//a[contains(@class,'checkout-button button alt wc-forward wp-element-button')]");
}
