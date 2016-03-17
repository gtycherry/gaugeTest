package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by tyguo on 1/7/16.
 */
public class AmazonShoppingCartPage {

    @FindBy(css="#huc-v2-order-row-confirm-text .a-text-bold")
    public WebElement cartText;
}
