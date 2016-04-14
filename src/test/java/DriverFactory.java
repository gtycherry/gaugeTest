import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeScenario;
import com.thoughtworks.gauge.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;

public class DriverFactory {
//    static FirefoxBinary binary = new FirefoxBinary(new File("/Users/tyguo/Documents/Projects/gauge-learning/gauge-learn-project/Tools/FirefoxPortable.exe"));
//    static FirefoxProfile profile = new FirefoxProfile();

    public static WebDriver driver;

//    @BeforeSuite
    @BeforeScenario
    public void initializeDriver(){
//        driver = new FirefoxDriver(binary, profile);
        driver = new FirefoxDriver();

    }

//    @AfterSuite
    @AfterScenario
         public void closeDriver(){
        driver.close();
        driver.quit();
    }


//    static WebDriver driver = null;
//
//    public static WebDriver getDriver() {
//        if (null == driver) {
////            System.setProperty("webdriver.chrome.driver", "/Users/tyguo/Documents/Projects/gauge-learning/gauge-learn-project/Tools/chromedriver");
//            driver = new FirefoxDriver(binary, profile);
//        }
//
//        Runtime.getRuntime().addShutdownHook(new Thread() {
//            public void run() {
//                driver.close();
//                driver.quit();
//                driver = null;
//            }
//        });
//        return driver;
//    }
}