import PageObjects.AmazonAddressInputPage;
import PageObjects.AmazonHomePage;
import PageObjects.AmazonUserProfilePage;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

/**
 * Created by tyguo on 3/28/16.
 */
public class AmazonUserProfileStep {
    AmazonHomePage amazonHomePage;
    AmazonUserProfilePage amazonUserProfilePage;
    AmazonAddressInputPage amazonAddressInputPage;

    @Step("用户导航到我的账户")
    public void navigateToMyAccount() {
        amazonHomePage = PageFactory.initElements(DriverFactory.driver, AmazonHomePage.class);
        amazonHomePage.clickMyAccount();
        DriverFactory.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Step("用户点击添加新地址")
    public void clickAddNewAddress() {
        amazonUserProfilePage = PageFactory.initElements(DriverFactory.driver, AmazonUserProfilePage.class);
        amazonUserProfilePage.clickAddNewAddress();
    }

    @Step("添加用户地址信息并保存")
    public void addAddressRecord() {
        amazonAddressInputPage = PageFactory.initElements(DriverFactory.driver, AmazonAddressInputPage.class);
        amazonAddressInputPage.inputAddressInfor();
        amazonAddressInputPage.clickSaveButton();
    }

    @Step("成功添加地址信息记录")
    public void verifyNewAddressAdded() {

    }
}
