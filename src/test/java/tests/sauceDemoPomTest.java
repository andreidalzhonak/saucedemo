package tests;

import constants.Credentials;
import constants.Urls;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pages.ProductsPomPage;
import pages.pages.SauceDemoLoginPomPage;
import pages.pages.YourCartPomPage;

public class sauceDemoPomTest extends BaseTest {
    @Test
    public void addCartTest() {
        SauceDemoLoginPomPage sauceDemoLoginPomPage = new SauceDemoLoginPomPage(driver);
        ProductsPomPage productsPomPage = new ProductsPomPage(driver);
        YourCartPomPage yourCartPomPage = new YourCartPomPage(driver);
        sauceDemoLoginPomPage.openSauceDemoLoginPage();
        sauceDemoLoginPomPage.inputUsername(Credentials.Username);
        sauceDemoLoginPomPage.inputPassword(Credentials.Password);
        sauceDemoLoginPomPage.clickLogin();
        productsPomPage.addToCart();
        productsPomPage.addShoppingCart();

        Assert.assertEquals(yourCartPomPage.takeItemName(), "Sauce Labs Backpack");
        Assert.assertEquals(yourCartPomPage.takeItemPrice(), "$29.99");
    }
}
