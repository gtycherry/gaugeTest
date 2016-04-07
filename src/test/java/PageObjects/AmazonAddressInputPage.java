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
    WebElement state;

    @FindBy (css ="#enterAddressState > table > tbody > tr:nth-child(7) > td:nth-child(1) > a")
    WebElement stateValue;

    @FindBy (id="cityTrigger")
    WebElement city;

    public void inputAddressInfor() {
        name.sendKeys("郭泰瑜");
    }

    public void clickSaveButton() {
    }
}
