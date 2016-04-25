package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by tyguo on 1/7/16.
 */
public class AmazonLoginPage {
    @FindBy(css = ".a-icon.a-icon-logo.auth-logo-cn")
    private WebElement homePageLink;

    @FindBy(id = "ap_email")
    private WebElement userEmail;

    @FindBy(id = "ap_password")
    private WebElement userPw;

    @FindBy(id = "signInSubmit")
    private WebElement loginButton;

    public void clickHomePageLink() {
        homePageLink.click();
    }

    public void inputCredentials() {
        userEmail.sendKeys("qalearningplan@163.com");
        userPw.sendKeys("Qa123456");
//        userEmail.sendKeys("cherrygty@sina.cn");
//        userPw.sendKeys("gty625811");
        loginButton.click();
    }
}
