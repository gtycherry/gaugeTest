package PageObjects;

import com.thoughtworks.gauge.Gauge;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by tyguo on 4/19/16.
 */
public class AmazonDeleteAddressConfirmationPage {
    @FindBy(linkText="确认")
    WebElement confirmButton;

    public void clickConfirmButton() {
        confirmButton.click();
        Gauge.writeMessage("Gauge提供定制的报告信息");
    }
}
