package TestsPageObjectCSS.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage extends BasePage{
    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public WebElement signInField() {
        return driver.findElement(By.cssSelector("div>form>div"));
    }

    public WebElement facebookBtnVisible() {
        return driver.findElement(By.cssSelector(" button.button--with-icon.auth-modal__social-button_type_facebook"));
    }
}
