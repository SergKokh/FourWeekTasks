package TestsPageObjectCSS.Tests;

import TestsPageObjectCSS.Page.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckHomePageElements extends TestInit{

    @Test
    public void checkMenuNout(){
        HomePage homePage = new HomePage(driver);
        homePage.checkMenu().get(1).click();

    }

    @Test
    public void checkCatalogBtn(){
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.catalogBtnVisibile().isDisplayed());
    }
}

