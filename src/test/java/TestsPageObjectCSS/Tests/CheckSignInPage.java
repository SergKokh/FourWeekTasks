package TestsPageObjectCSS.Tests;

import TestsPageObjectCSS.Page.HomePage;
import TestsPageObjectCSS.Page.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckSignInPage extends TestInit1{

    @Test
    public void checkSignInField(){
        HomePage homePage = new HomePage(driver);
        homePage.openRozetka();
        homePage.getSignInPage().click();
        SignInPage signInPage = new SignInPage(driver);
        Assert.assertTrue(signInPage.signInField().isDisplayed());
    }
    @Test
    public void checkFacebookBtn(){
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);
        homePage.openRozetka();
        sleep(2);
        homePage.getSignInPage().click();
        Assert.assertTrue(signInPage.facebookBtnVisible().isDisplayed());
    }
}
