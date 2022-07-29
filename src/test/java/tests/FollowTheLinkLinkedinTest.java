package tests;

import models.LoginSauceLab;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pages.SauceDemoLoginPomPage;
import testdata.PrepareLoginData;

public class FollowTheLinkLinkedinTest extends BaseTest {
    @Test
    public void addCartTest() {
        SauceDemoLoginPomPage sauceDemoLoginPomPage = new SauceDemoLoginPomPage(driver);
        sauceDemoLoginPomPage.openSauceDemoLoginPage();
        LoginSauceLab loginSauceLab = PrepareLoginData.getValidRegistration1();
        sauceDemoLoginPomPage.inputUsername(loginSauceLab.getUsername());
        sauceDemoLoginPomPage.inputPassword(loginSauceLab.getPassword());
        sauceDemoLoginPomPage.clickLogin();
        sauceDemoLoginPomPage.clickLinkedinButton();
        sauceDemoLoginPomPage.switchToNewTab();
        Assert.assertTrue(sauceDemoLoginPomPage.logoLinkedin());
    }
}
