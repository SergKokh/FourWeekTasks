package TestsPageObjectCSS.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage{
    public CartPage(WebDriver driver) {
        super(driver);
    }

    public WebElement cartModalWindowVisibile() {
        return driver.findElement(By.cssSelector("body > app-root > rz-single-modal-window > div.modal__holder.modal__holder_show_animation.modal__holder--large > div.modal__content > rz-shopping-cart"));
    }
}