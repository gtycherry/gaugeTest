import PageObjects.AmazonHomePage;
import PageObjects.AmazonLoginPage;
import PageObjects.AmazonRegisterPage;
import PageObjects.AmazonShoppingCartPage;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

import static org.hamcrest.core.Is.is;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by tyguo on 12/28/15.
 */
public class AmazonDemoStep {
    @Step("User navigate to Amazon home page")
    public void navigateToAmazonHomePage() {
        DriverFactory.driver.get(AmazonHomePage.Url);
    }

    @Step("User clicks register link on home page")
    public void userSelectRegisterLink() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(DriverFactory.driver, AmazonHomePage.class);
        amazonHomePage.clickRegisterLink();
    }

    @Step("He input the information required and click register button")
    public void userInputRegisterInfor() {
        AmazonRegisterPage amazonRegisterPage = PageFactory.initElements(DriverFactory.driver, AmazonRegisterPage.class);
        amazonRegisterPage.inputRegisterInfor();
        amazonRegisterPage.clickRegisterButton();

    }

    @Step("He should be registered successfully and automatically logged in")
    public void verifyRegistrationIsSuccessful() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(DriverFactory.driver, AmazonHomePage.class);
        assertThat(amazonHomePage.userNameIsDisplayed(), is("您好, daisy"));
    }

    @Step("User search <productName> on home page")
    public void searchProduct(String productName) {
        AmazonHomePage amazonHomePage = PageFactory.initElements(DriverFactory.driver, AmazonHomePage.class);
        amazonHomePage.searchProduct(productName);

    }

    @Step("User add the first product to his shopping cart")
    public void addProductToCart() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(DriverFactory.driver, AmazonHomePage.class);
        amazonHomePage.addProductToCart();
    }

//    @Step("Product is added to shopping cart successfully")
//    public void shoppingCartDisplay() {
//        AmazonShoppingCartPage amazonShoppingCartPage = PageFactory.initElements(DriverFactory.driver, AmazonShoppingCartPage.class);
//        assertThat(amazonShoppingCartPage.cartText.getText(), is("商品已加入购物车"));
//    }

    @Step("User register bundles of accounts with below the information in below table <table>")
    public void registerManyUser(Table table) {
        AmazonHomePage amazonHomePage = PageFactory.initElements(DriverFactory.driver, AmazonHomePage.class);
        AmazonRegisterPage amazonRegisterPage = PageFactory.initElements(DriverFactory.driver, AmazonRegisterPage.class);
        AmazonLoginPage amazonLoginPage = PageFactory.initElements(DriverFactory.driver, AmazonLoginPage.class);
        List<List<String>> rows = table.getRows();
        for (List<String> row : rows) {
//            amazonHomePage.clickLogoutLink();
//            amazonLoginPage.clickHomePageLink();
            amazonHomePage.clickRegisterLink();
            amazonRegisterPage.inputRegisterInformation(row.get(0), row.get(1), row.get(2), row.get(3), row.get(4));
            amazonRegisterPage.clickRegisterButton();
        }

    }

    @Step("He logout amazon")
    public void logoutAmazon() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(DriverFactory.driver, AmazonHomePage.class);
        AmazonLoginPage amazonLoginPage = PageFactory.initElements(DriverFactory.driver, AmazonLoginPage.class);
        amazonHomePage.clickLogoutLink();
        amazonLoginPage.clickHomePageLink();

    }

    @Step("User clicks login link on home page")
    public void goToLoginPage() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(DriverFactory.driver, AmazonHomePage.class);
        amazonHomePage.clickLogin();

    }

    @Step("He login with his credentials")
    public void login() {
        AmazonLoginPage amazonLoginPage = PageFactory.initElements(DriverFactory.driver, AmazonLoginPage.class);
        amazonLoginPage.inputCredentials();
    }

    @Step("He can logout after he login")
    public void logout() {
        AmazonHomePage amazonHomePage = PageFactory.initElements(DriverFactory.driver, AmazonHomePage.class);
        amazonHomePage.clickLogoutLink();

    }
}


