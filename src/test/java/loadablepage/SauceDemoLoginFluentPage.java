package loadablepage;

import constants.Credentials;
import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.pages.BasePomPage;

import java.util.ArrayList;


public class SauceDemoLoginFluentPage extends BaseLoadablePage {

    private By USERNAME_INPUT = By.id("user-name");
    private By PASSWORD_INPUT = By.id("password");
    private By LOGIN_BUTTON = By.id("login-button");
    private By LINKEDIN_BUTTON = By.xpath("//*[@id=\"page_wrapper\"]/footer/ul/li[3]/a");
    private By LOGO_LINKEDIN = By.cssSelector("body > div > header > nav > a > icon");


    public SauceDemoLoginFluentPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return driver.findElement(LOGO_LINKEDIN).isDisplayed();
    }

    public SauceDemoLoginFluentPage openSauceDemoLoginPage() {
        driver.get(Urls.REGISTER_FORM_URL);
        return this;
    }

    public SauceDemoLoginFluentPage inputUsername(String Username) {
        driver.findElement(USERNAME_INPUT).sendKeys(Credentials.USERNAME1);
        return this;
    }

    public SauceDemoLoginFluentPage inputPassword(String Password) {
        driver.findElement(PASSWORD_INPUT).sendKeys(Credentials.PASSWORD);
        return this;
    }

    public SauceDemoLoginFluentPage clickLogin() {
        driver.findElement(LOGIN_BUTTON).click();
        return this;
    }

    public SauceDemoLoginFluentPage clickLinkedinButton() {
        driver.findElement(LINKEDIN_BUTTON).click();
        return this;
    }

    public SauceDemoLoginFluentPage switchToNewTab() {
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        return this;
    }

    public boolean logoLinkedin() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 5);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(LOGO_LINKEDIN));
        boolean textLogo = driver.findElement(LOGO_LINKEDIN).isDisplayed();
        return textLogo;
    }
}
