import PageObjects.*;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

/**
 * Created by tyguo on 3/28/16.
 */
public class AmazonUserProfileStep {
    AmazonHomePage amazonHomePage = PageFactory.initElements(DriverFactory.driver, AmazonHomePage.class);
    AmazonUserProfilePage amazonUserProfilePage = PageFactory.initElements(DriverFactory.driver, AmazonUserProfilePage.class);
    AmazonAddressInputPage amazonAddressInputPage = PageFactory.initElements(DriverFactory.driver, AmazonAddressInputPage.class);
    AmazonAddressManagementPage amazonAddressManagementPage = PageFactory.initElements(DriverFactory.driver, AmazonAddressManagementPage.class);
    AmazonDeleteAddressConfirmationPage amazonDeleteAddressPage = PageFactory.initElements(DriverFactory.driver, AmazonDeleteAddressConfirmationPage.class);

    @Step("User navigate to my account zone")
    public void navigateToMyAccount() {
        amazonHomePage.clickMyAccount();
        DriverFactory.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Step("User click add new address link")
    public void clickAddNewAddress() {
        amazonUserProfilePage.clickAddNewAddress();
    }

    @Step("User add new address and save the record")
    public void addAddressRecord() {
        amazonAddressInputPage.inputAddressInfor();
        amazonAddressInputPage.clickSaveButton();
    }

    @Step("The new address is added successfully")
    public void verifyNewAddressAdded() {
        amazonAddressManagementPage.addressAddAlterDisplay();
    }

    @Step("User delete the address")
    public void deleteAddress() {
        DriverFactory.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        amazonAddressManagementPage.clickDeleteButton();
        DriverFactory.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        amazonDeleteAddressPage.clickConfirmButton();

    }

}
