package base;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static constant.Constants.WEBLINK;

public class BaseTest {static WebDriver webDriver = null;

    @BeforeScenario
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "libs\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("disable-notifications");
        chromeOptions.addArguments("disable-popup-blocking");
        setWebDriver(new ChromeDriver(chromeOptions));
        getWebDriver().navigate().to(WEBLINK);

    }

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public static void setWebDriver(WebDriver driver) {
        base.BaseTest.webDriver = driver;
    }

    @AfterScenario
    public void tearDown() {
        getWebDriver().quit();
    }
}
