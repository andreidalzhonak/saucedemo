package pages.pages;

import constants.Credentials;
import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceDemoLoginPomPage extends BasePomPage {

    private By USERNAME_INPUT = By.id("user-name");
    private By PASSWORD_INPUT = By.id("password");
    private By LOGIN_BUTTON = By.id("login-button");


    public SauceDemoLoginPomPage(WebDriver driver) {
        super(driver);
    }
    public void openSauceDemoLoginPage() {
        driver.get(Urls.REGISTER_FORM_URL);
    }
    public void inputUsername(String Username) {
        driver.findElement(USERNAME_INPUT).sendKeys(Credentials.Username);
    }
    public void inputPassword(String Password) {
        driver.findElement(PASSWORD_INPUT).sendKeys(Credentials.Password);
    }
    public void clickLogin() {
        driver.findElement(LOGIN_BUTTON).click();
    }
    public void loginPage () {
        driver.get(Urls.REGISTER_FORM_URL);
        driver.findElement(USERNAME_INPUT).sendKeys(Credentials.Username);
        driver.findElement(PASSWORD_INPUT).sendKeys(Credentials.Password);
        driver.findElement(LOGIN_BUTTON).click();
    }
}
