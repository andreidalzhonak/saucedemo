package tests;

import models.LoginSauceLab;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pages.ProductsPomPage;
import pages.pages.SauceDemoLoginPomPage;
import pages.pages.YourCartPomPage;
import testdata.PrepareLoginData;

public class sauceDemoPomTest extends BaseTest {
    @Test
    public void addCartTest() {
        SauceDemoLoginPomPage sauceDemoLoginPomPage = new SauceDemoLoginPomPage(driver);
        ProductsPomPage productsPomPage = new ProductsPomPage(driver);
        YourCartPomPage yourCartPomPage = new YourCartPomPage(driver);
        sauceDemoLoginPomPage.openSauceDemoLoginPage();
        LoginSauceLab loginSauceLab = PrepareLoginData.getValidRegistration1();
        sauceDemoLoginPomPage.inputUsername(loginSauceLab.getUsername());
        sauceDemoLoginPomPage.inputPassword(loginSauceLab.getPassword());
        sauceDemoLoginPomPage.clickLogin();
        productsPomPage.shoppingCart();
        Assert.assertEquals(yourCartPomPage.takeItemName(), "Sauce Labs Backpack");
        Assert.assertEquals(yourCartPomPage.takeItemPrice(), "$29.99");
    }
}
