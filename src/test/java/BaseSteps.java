import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseSteps {

    protected WebDriver driver;

    protected void startWebDriver() {
        Properties props = System.getProperties();
    //enter your own path of driver
        props.setProperty("webdriver.gecko.driver", "C:\\Files\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    protected void stopWebDriver() {
        driver.quit();
    }

}

