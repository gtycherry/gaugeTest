import PageObjects.AmazonHomePage;
import PageObjects.AmazonLoginPage;
import PageObjects.AmazonRegisterPage;
import PageObjects.AmazonShoppingCartPage;
import com.thoughtworks.gauge.Gauge;
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
    private AmazonHomePage amazonHomePage = PageFactory.initElements(DriverFactory.driver, AmazonHomePage.class);
    private AmazonRegisterPage amazonRegisterPage = PageFactory.initElements(DriverFactory.driver, AmazonRegisterPage.class);
    private AmazonLoginPage amazonLoginPage = PageFactory.initElements(DriverFactory.driver, AmazonLoginPage.class);

    @Step("User navigate to Amazon home page")
    public void navigateToAmazonHomePage() {
        DriverFactory.driver.get(AmazonHomePage.Url);
        DriverFactory.driver.manage().window().maximize();
    }

    @Step("User clicks register link on home page")
    public void userSelectRegisterLink() {
        DriverFactory.driver.get(AmazonHomePage.Url);
        DriverFactory.driver.manage().window().maximize();
        amazonHomePage.clickRegisterLink();
    }

    @Step("He input the information required and click register button")
    public void userInputRegisterInfor() {
        amazonRegisterPage.inputRegisterInfor();
        amazonRegisterPage.clickRegisterButton();

    }

    @Step("He should be registered successfully and automatically logged in")
    public void verifyRegistrationIsSuccessful() {
        assertThat(amazonHomePage.userNameIsDisplayed(), is("您好, qalearningplan1"));
    }

    @Step("User register bundles of accounts with below information <table>")
    public void registerManyUser(Table table) {
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

    @Step("User clicks login link on home page")
    public void goToLoginPage() {
        amazonHomePage = PageFactory.initElements(DriverFactory.driver, AmazonHomePage.class);
        amazonHomePage.clickLogin();

    }

    @Step("He login with his credentials")
    public void login() {
        amazonLoginPage.inputCredentials();
    }

    @Step("User logout amazon")
    public void logout() {
        amazonHomePage.clickLogoutLink();

    }
}


