import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeScenario;
import com.thoughtworks.gauge.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    public static WebDriver driver;

    @BeforeSuite
//    @BeforeScenario
    public void initializeDriver(){
        driver = new FirefoxDriver();
    }

    @AfterSuite
//    @AfterScenario
         public void closeDriver(){
        driver.close();
        driver.quit();
    }
}
