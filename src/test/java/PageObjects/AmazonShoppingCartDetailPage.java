package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by tyguo on 4/8/16.
 */
public class AmazonShoppingCartDetailPage {
    @FindBy(id = ".a-size-small.sc-action-delete")
    private WebElement deleteLink;

    public void deleteProduct() {
        deleteLink.click();
    }
}
