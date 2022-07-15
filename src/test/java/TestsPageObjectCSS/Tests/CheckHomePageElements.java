package TestsPageObjectCSS.Tests;

import TestsPageObjectCSS.Page.CartPage;
import TestsPageObjectCSS.Page.HomePage;
import TestsPageObjectCSS.Page.SmartTvAndElektronicsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckHomePageElements extends TestInit{

    @Test
    public void checkMenuNout(){
        HomePage homePage = new HomePage(driver);
        SmartTvAndElektronicsPage smartTvAndElektronics = new  SmartTvAndElektronicsPage(driver);
        homePage.checkMenu().get(1).click();
        sleep(2);
        Assert.assertTrue(smartTvAndElektronics.bannerCategoryVisibile().isDisplayed());

    }

    @Test
    public void checkCatalogBtn(){
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.catalogBtnVisibile().isDisplayed());
    }

    @Test
    public void checkBannerOnPage(){
        HomePage homePage = new HomePage(driver);
        SmartTvAndElektronicsPage smartTvAndElektronicsPage = new SmartTvAndElektronicsPage(driver);
        homePage.checkMenu().get(1).click();
        sleep(2);
        Assert.assertTrue(smartTvAndElektronicsPage.bannerActionVisibile().isDisplayed());
    }
    @Test
    public void checkModalContentCart(){
        HomePage homePage = new HomePage(driver);
        CartPage cartPage = new CartPage(driver);
        homePage.clickCartBtn().click();
        Assert.assertTrue(cartPage.cartModalWindowVisibile().isDisplayed());
    }
}

