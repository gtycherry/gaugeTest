import PageObjects.AmazonHomePage;
import PageObjects.AmazonShoppingCartDetailPage;
import PageObjects.AmazonShoppingCartPage;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by tyguo on 4/7/16.
 */
public class AmazonShoppingStep {
    private AmazonHomePage amazonHomePage;
    private AmazonShoppingCartPage amazonShoppingCartPage;
    private AmazonShoppingCartDetailPage amazonShoppingCartDetailPage;

    @Step("User search <productName> on home page")
    public void searchProduct(String productName) {
        amazonHomePage = PageFactory.initElements(DriverFactory.driver, AmazonHomePage.class);
        amazonHomePage.searchProduct(productName);

    }

    @Step("User add the first product to his shopping cart")
    public void addProductToCart() {
        amazonHomePage = PageFactory.initElements(DriverFactory.driver, AmazonHomePage.class);
        amazonHomePage.addProductToCart();
        DriverFactory.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Step("The product is added to cart successfully")
    public void verifyProductAdded() {
        amazonShoppingCartPage = PageFactory.initElements(DriverFactory.driver, AmazonShoppingCartPage.class);
        DriverFactory.driver.switchTo().window(" 亚马逊购物车");
        amazonShoppingCartPage.productAddedMessageDisplay();
    }

    @Step("click shopping cart button to view shopping cart")
    public void openShoppingCart() {
        amazonShoppingCartPage.clickShoppingCart();


    }

    @Step("click delete button besides product")
    public void deleteProduct() {
        amazonShoppingCartDetailPage = PageFactory.initElements(DriverFactory.driver, AmazonShoppingCartDetailPage.class);
        amazonShoppingCartDetailPage.deleteProduct();
    }

}
