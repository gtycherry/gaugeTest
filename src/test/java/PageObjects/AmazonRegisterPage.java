package PageObjects;

import com.thoughtworks.gauge.Table;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by tyguo on 12/28/15.
 */
public class AmazonRegisterPage {

    @FindBy(id = "ap_customer_name")
    WebElement userName;

    @FindBy(id = "ap_email")
    WebElement userEmailOrPhone;

//    @FindBy(id = "ap_email_check")
//    WebElement userEmailOrPhoneConfirmation;

    @FindBy(id = "ap_password")
    WebElement userPassword;

    @FindBy(id = "ap_password_check")
    WebElement userPasswordConfirmation;

    @FindBy(name = "legalAgreementCheckBox")
    WebElement agreementCheckbox;

    @FindBy(id = "continue")
    private WebElement registerButton;

    public void inputRegisterInfor() {
        userName.sendKeys("qalearningplan");
        userEmailOrPhone.sendKeys("qalearning@163.com");
//        userEmailOrPhoneConfirmation.sendKeys("daisy@163.com");
        userPassword.sendKeys("123456");
        userPasswordConfirmation.sendKeys("123456");
        agreementCheckbox.click();
    }


    public void clickRegisterButton() {
        registerButton.click();
    }

    public void inputRegisterInformation(String name, String emailOrPhone, String emailOrPhoneConfirmation, String password, String passwordConfirmation) {
        userName.sendKeys(name);
        userEmailOrPhone.sendKeys(emailOrPhone);
//        userEmailOrPhoneConfirmation.sendKeys(emailOrPhoneConfirmation);
        userPassword.sendKeys(password);
        userPasswordConfirmation.sendKeys(passwordConfirmation);
        agreementCheckbox.click();
    }

//    public void inputRegisterInformationTable(Table table) {
//        List<List<String>> rows = table.getRows();
//        for (List<String> row : rows) {
//            inputRegisterInformation(row.get(0), row.get(1), row.get(2), row.get(3), row.get(4));
//            registerButton.click();
//        }
//    }
}