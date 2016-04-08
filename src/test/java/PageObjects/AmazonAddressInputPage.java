package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

/**
 * Created by tyguo on 3/28/16.
 */
public class AmazonAddressInputPage {
    @FindBy(id="enterAddressFullName")
    WebElement name;

    @FindBy (id="stateTrigger")
    WebElement stateTrigger;

    @FindBy (css="#enterAddressState tr:nth-child(7) td:nth-child(1) a")
    WebElement stateValue;

    @FindBy (css="#enterAddressCity tr:nth-child(2) td:nth-child(1) a")
    WebElement cityValue;

    @FindBy (css ="#enterAddressDistrict tr:nth-child(6) td:nth-child(4) a")
    WebElement districtValue;

    @FindBy (id="enterAddressAddressLine1")
    WebElement streetAddress;

    @FindBy (id="enterAddressPostalCode")
    WebElement postCode;

    @FindBy (id="enterAddressPhoneNumber")
    WebElement phoneNumber;

    @FindBy (id="enterAddressTaxId")
    WebElement taxId;

    @FindBy (id = "myab_newAddressButton")
    WebElement saveContinue;

    public void inputAddressInfor() {
        name.sendKeys("郭泰瑜");
        stateTrigger.click();
        stateValue.click();
        cityValue.click();
        districtValue.click();
        streetAddress.sendKeys("天府大道中段88号");
        postCode.sendKeys("610041");
        phoneNumber.sendKeys("18615700625");
        taxId.sendKeys("51202819890432234");
    }

    public void clickSaveButton() {
        saveContinue.click();
    }
}
