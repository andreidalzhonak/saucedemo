package tests;

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
        sauceDemoLoginPomPage.loginPage();
        productsPomPage.shoppingCart();
        Assert.assertEquals(yourCartPomPage.takeItemName(), "Sauce Labs Backpack");
        Assert.assertEquals(yourCartPomPage.takeItemPrice(), "$29.99");
    }
}
