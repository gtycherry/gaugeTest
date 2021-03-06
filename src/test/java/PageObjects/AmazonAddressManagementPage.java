package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by tyguo on 4/7/16.
 */
public class AmazonAddressManagementPage {
    @FindBy(id ="myab-alert-bar-title")
    WebElement addressAddedInfor;

    @FindBy(linkText = "删除")
    WebElement deleteButton;

    public void addressAddAlterDisplay() {
        Assert.assertEquals(addressAddedInfor.getText(), "已成功添加您的地址");
    }

    public void clickDeleteButton() {
        deleteButton.click();
    }

}