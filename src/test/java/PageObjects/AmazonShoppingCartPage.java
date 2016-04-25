package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by tyguo on 1/7/16.
 */
public class AmazonShoppingCartPage {

    @FindBy(css=".a-size-medium.a-text-bold")
    public WebElement productAddedMessage;

    @FindBy(css="#hlb-view-cart-announce")
    private WebElement shoppingCartButton;

    public void productAddedMessageDisplay() {

        Assert.assertEquals(productAddedMessage.getText(), "商品已加入购物车" );
    }

    public void clickShoppingCart() {

        shoppingCartButton.click();
    }
}
