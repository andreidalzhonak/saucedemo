package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pages.SauceDemoLoginPomPage;

public class FollowTheLinkLinkedinTest extends BaseTest {
    @Test
    public void addCartTest() {
        SauceDemoLoginPomPage sauceDemoLoginPomPage = new SauceDemoLoginPomPage(driver);
        sauceDemoLoginPomPage.loginPage();
        removeImplicitlyWait();
        sauceDemoLoginPomPage.clickLinkedinButton();
        setImplicitlyWait();
        sauceDemoLoginPomPage.switchToNewTab();
        Assert.assertTrue(sauceDemoLoginPomPage.logoLinkedin());
    }
}
