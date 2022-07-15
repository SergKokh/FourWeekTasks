package TestsPageObjectCSS.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.awt.*;

public class TestInit1 {
    public WebDriver driver;
    ChromeOptions optionsChrome = new ChromeOptions();
    FirefoxOptions optionsFirefox = new FirefoxOptions();
    // якщо потрібно запустити тести не відкриваючи браузер =true
    boolean headless = false;

    public WebDriver getDriverByName(String browserType) {
        WebDriver driver = null;
        if (browserType.equals("chrome")) {
            optionsChrome.setHeadless(headless);
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(optionsChrome);
            if (headless) {
                driver.manage().window().setSize(new Dimension(1920, 1200));
            } else {
                driver.manage().window().maximize();
            }
        }
//        if (browserType.equals("opera")) {
//            WebDriverManager.operadriver().setup();
//            driver = new OperaDriver();
//            driver.manage().window().maximize();
//        }
        if (browserType.equals("firefox")) {
            optionsFirefox.setHeadless(headless);
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver(optionsFirefox);
            if (headless) {
                driver.manage().window().setSize(new Dimension(1920, 1200));
            } else {
                driver.manage().window().maximize();
            }
        }
        return driver;
    }

    @Parameters("driver-name")
    @BeforeMethod
    public void startTest(@Optional("chrome") String browserName) throws Exception {
         driver = getDriverByName(browserName);
    }
//            @AfterMethod
//    public void closeBrowser(){
//        driver.quit();
//    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void driveMouse() {
        try {
            //moves mouse to the middle of the screen
            new Robot().mouseMove((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 2, (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 2);
            //remember to use try-catch block (always, and remember to delete this)
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
