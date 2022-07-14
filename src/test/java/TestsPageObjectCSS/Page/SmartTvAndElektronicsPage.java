package TestsPageObjectCSS.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SmartTvAndElektronicsPage extends BasePage{
    public SmartTvAndElektronicsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement bannerCategoryVisibile() {
        return driver.findElement(By.cssSelector("body > app-root > div > div > rz-super-portal > div > main > section > div:nth-child(2) > h1"));
    }

    public WebElement bannerActionVisibile() {
        return driver.findElement(By.cssSelector("a > picture > img"));
    }
//    public WebElement bannerActionVisibile1() {
//        return driver.findElement(By.xpath("//div[@class= 'simple-slider']/button[@class='top-widget__slider-prev']"));
//    }
}
