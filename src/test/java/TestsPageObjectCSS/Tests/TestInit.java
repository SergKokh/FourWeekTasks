package TestsPageObjectCSS.Tests;

import TestsPageObjectCSS.Page.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.awt.*;

public class TestInit {
    public WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
            HomePage homePage = new HomePage(driver);
            homePage.openRozetka();
        }



//    @AfterMethod
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
