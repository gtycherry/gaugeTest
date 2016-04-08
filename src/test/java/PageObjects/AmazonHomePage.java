package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by tyguo on 12/28/15.
 */
public class AmazonHomePage extends BasePage {

    private WebDriver driver;

    public static String Url = URL;

    @FindBy(id = "nav-link-yourAccount")
    private WebElement accountZone;

    @FindBy(xpath = "//*[@id=\"nav-flyout-ya-newCust\"]/a")
    private WebElement registerLink;

    @FindBy(xpath = "//*[@id=\"nav-link-yourAccount\"]/span[1]")
    private WebElement userName;

    @FindBy(xpath = "//*[@id=\"nav-item-signout\"]/span")
    private WebElement logoutLink;


    @FindBy(xpath = "//*[@id=\"nav-flyout-ya-signin\"]/a/span")
    private WebElement loginLink;

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchField;

    @FindBy(xpath = "//*[@id=\"nav-search\"]/form/div[2]/div/input")
    private WebElement searchButton;

    @FindBy(css = ".a-button-input:nth-of-type(1)")
    private WebElement firstProduct;

    @FindBy(css = "#nav-link-yourAccount .nav-line-2")
    private WebElement myAccountLink;

    public AmazonHomePage(WebDriver driver) {

        this.driver = driver;
    }


    public void clickRegisterLink() {
        Actions action1 = new Actions(driver);
        action1.moveToElement(accountZone).clickAndHold(registerLink).build().perform();
        action1.release(accountZone).perform();//add this line as i upgrade the selenium java version to 2.52.0
        registerLink.click();
    }

    public String userNameIsDisplayed() {
        return (userName.getText());
    }

    public void searchProduct(String productName) {
        searchField.sendKeys(productName);
        searchButton.click();
    }

    public void addProductToCart() {
        firstProduct.click();
    }

    public void clickLogoutLink() {
        Actions action1 = new Actions(driver);
        action1.moveToElement(accountZone).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(logoutLink));
        logoutLink.click();
    }

    public void clickLogin() {
        Actions action1 = new Actions(driver);
        action1.moveToElement(accountZone).clickAndHold(loginLink).build().perform();
        action1.release(accountZone).perform();//add this line as i upgrade the selenium java version to 2.52.0
        loginLink.click();
    }

    public void clickMyAccount() {
//        Actions action1 = new Actions(driver);
//        action1.moveToElement(accountZone).clickAndHold(myAccountLink).build().perform();
//        action1.release(accountZone).perform();//add this line as i upgrade the selenium java version to 2.52.0
        myAccountLink.click();
    }
}
