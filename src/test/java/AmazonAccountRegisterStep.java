import PageObjects.AmazonHomePage;
import PageObjects.AmazonLoginPage;
import PageObjects.AmazonRegisterPage;
import PageObjects.AmazonShoppingCartPage;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import org.openqa.selenium.support.PageFactory;


import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.core.Is.is;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by tyguo on 12/28/15.
 */
public class AmazonAccountRegisterStep {
    private AmazonHomePage amazonHomePage;
    private AmazonRegisterPage amazonRegisterPage;
    private AmazonLoginPage amazonLoginPage;

    @Step("User navigate to Amazon home page")
    public void navigateToAmazonHomePage() {
        DriverFactory.driver.get(AmazonHomePage.Url);
        DriverFactory.driver.manage().window().maximize();
    }

    @Step("User clicks register link on home page")
    public void userSelectRegisterLink() {
        amazonHomePage = PageFactory.initElements(DriverFactory.driver, AmazonHomePage.class);
        amazonHomePage.clickRegisterLink();
    }

    @Step("He input the information required and click register button")
    public void userInputRegisterInfor() {
        amazonRegisterPage = PageFactory.initElements(DriverFactory.driver, AmazonRegisterPage.class);
        amazonRegisterPage.inputRegisterInfor();
        amazonRegisterPage.clickRegisterButton();

    }

    @Step("He should be registered successfully and automatically logged in")
    public void verifyRegistrationIsSuccessful() {
        amazonHomePage = PageFactory.initElements(DriverFactory.driver, AmazonHomePage.class);
        assertThat(amazonHomePage.userNameIsDisplayed(), is("您好, qalearningplan"));
    }

    @Step("User register bundles of accounts with below the information in below table <table>")
    public void registerManyUser(Table table) {
        amazonHomePage = PageFactory.initElements(DriverFactory.driver, AmazonHomePage.class);
        amazonRegisterPage = PageFactory.initElements(DriverFactory.driver, AmazonRegisterPage.class);
        amazonLoginPage = PageFactory.initElements(DriverFactory.driver, AmazonLoginPage.class);
        List<List<String>> rows = table.getRows();
        for (List<String> row : rows) {
            amazonHomePage.clickLogoutLink();
            DriverFactory.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            amazonLoginPage.clickHomePageLink();
            DriverFactory.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            amazonHomePage.clickRegisterLink();
            amazonRegisterPage.inputRegisterInformation(row.get(0), row.get(1), row.get(2), row.get(3), row.get(4));
            amazonRegisterPage.clickRegisterButton();
        }

    }

    @Step("He logout amazon")
    public void logoutAmazon() {
        amazonHomePage = PageFactory.initElements(DriverFactory.driver, AmazonHomePage.class);
        amazonLoginPage = PageFactory.initElements(DriverFactory.driver, AmazonLoginPage.class);
        amazonHomePage.clickLogoutLink();
        amazonLoginPage.clickHomePageLink();

    }

    @Step("User clicks login link on home page")
    public void goToLoginPage() {
        amazonHomePage = PageFactory.initElements(DriverFactory.driver, AmazonHomePage.class);
        amazonHomePage.clickLogin();

    }

    @Step("He login with his credentials")
    public void login() {
        amazonLoginPage = PageFactory.initElements(DriverFactory.driver, AmazonLoginPage.class);
        amazonLoginPage.inputCredentials();
    }

    @Step("He can logout after he login")
    public void logout() {
        amazonHomePage = PageFactory.initElements(DriverFactory.driver, AmazonHomePage.class);
        amazonHomePage.clickLogoutLink();

    }

}


