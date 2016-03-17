package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by tyguo on 1/7/16.
 */
public class AmazonLoginPage {
    @FindBy(xpath = "//*[@id=\"ap_header\"]/a")
    private WebElement homePageLink;

    @FindBy(id = "ap_email")
    private WebElement userEmail;

    @FindBy(id = "ap_password")
    private WebElement userPw;

    @FindBy(id = "signInSubmit-input")
    private WebElement loginButton;

    public void clickHomePageLink() {
        homePageLink.click();
    }

    public void inputCredentials() {
        userEmail.sendKeys("gauge15@gmail.com");
        userPw.sendKeys("123456");
        loginButton.click();
    }
}
