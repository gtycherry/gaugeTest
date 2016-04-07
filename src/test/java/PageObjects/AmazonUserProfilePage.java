package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by tyguo on 3/28/16.
 */
public class AmazonUserProfilePage {
    @FindBy(css = ".a-box.a-spacing-top-medium:nth-child(3) .a-column.a-span6.a-spacing-top-small.a-span-last .a-spacing-micro:nth-child(2) a")
//    @FindBy(linkText ="添加新地址" )
    private WebElement addNewAddress;

    public void clickAddNewAddress() {
        System.out.println("this is a testing");
        addNewAddress.click();
    }
}
