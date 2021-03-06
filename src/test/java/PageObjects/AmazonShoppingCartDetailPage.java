package PageObjects;

import com.thoughtworks.gauge.Gauge;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

/**
 * Created by tyguo on 4/8/16.
 */
public class AmazonShoppingCartDetailPage {
    @FindBy(css="[value = '删除']")
    private WebElement deleteLink;

    @FindBy(css=".sc-list-body .sc-list-item-removed-msg div:nth-of-type(1)")
    private WebElement deleteConfirmationMessage;

    @FindBy (id = "a-autoid-1-announce")
    private WebElement amountField;

    @FindBy (id = "dropdown1_1")
    private WebElement amountValue;

    public void deleteProduct(String productName) {
        deleteLink.click();
    }

    public void deleteProductMessageDisplay(String productName) {
        Assert.assertTrue(deleteConfirmationMessage.getText().contains("从购物车成功删除"));
//        Assert.assertTrue(deleteConfirmationMessage.getText().contains(productName));

    }

    public void editAmountOfProduct() {
        amountField.click();
        amountValue.click();
    }
}
