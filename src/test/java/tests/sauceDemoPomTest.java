package tests;

import models.LoginSauceLab;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pages.ProductsPomPage;
import pages.pages.SauceDemoLoginPomPage;
import pages.pages.YourCartPomPage;
import testdata.PrepareLoginData;
import utils.RetryAnalyzer;

public class sauceDemoPomTest extends BaseTest{
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void addCartTest() {
        SauceDemoLoginPomPage sauceDemoLoginPomPage = new SauceDemoLoginPomPage(driver);
        ProductsPomPage productsPomPage = new ProductsPomPage(driver);
        YourCartPomPage yourCartPomPage = new YourCartPomPage(driver);
        sauceDemoLoginPomPage.openSauceDemoLoginPage();
        LoginSauceLab loginSauceLab = PrepareLoginData.getValidRegistration1();
        sauceDemoLoginPomPage.loginPage();
        productsPomPage.shoppingCart();
        Assert.assertEquals(yourCartPomPage.takeItemName(), "Sauce Labs Backpack");
        Assert.assertEquals(yourCartPomPage.takeItemPrice(), "$29.98");
    }
}
