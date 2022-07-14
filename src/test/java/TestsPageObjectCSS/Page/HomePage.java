package TestsPageObjectCSS.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void openRozetka(){
        driver.get("https://rozetka.com.ua/");
    }
    public List<WebElement> checkMenu(){
        return driver.findElements(By.cssSelector("[class=menu-categories__link]"));

    }

    public WebElement catalogBtnVisibile() {
        return driver.findElement(By.cssSelector("[id=fat-menu]"));
    }

    public WebElement clickCartBtn() {
        return driver.findElement(By.xpath("//rz-cart[@class='header-actions__component']//button[@type='button']//*[name()='svg']"));
    }
}
