package pages.pages;

import constants.Credentials;
import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


public class SauceDemoLoginPomPage extends BasePomPage {

    private By USERNAME_INPUT = By.id("user-name");
    private By PASSWORD_INPUT = By.id("password");
    private By LOGIN_BUTTON = By.id("login-button");
    private By LINKEDIN_BUTTON = By.xpath("//*[@id=\"page_wrapper\"]/footer/ul/li[3]/a");
    private By LOGO_LINKEDIN = By.cssSelector("body > div > header > nav > a > icon");

    public SauceDemoLoginPomPage(WebDriver driver) {
        super(driver);
    }

    public void openSauceDemoLoginPage() {
        driver.get(Urls.REGISTER_FORM_URL);
    }

    public void inputUsername(String Username) {
        driver.findElement(USERNAME_INPUT).sendKeys(Credentials.USERNAME1);
    }

    public void inputPassword(String Password) {
        driver.findElement(PASSWORD_INPUT).sendKeys(Credentials.PASSWORD);
    }

    public void clickLogin() {
        driver.findElement(LOGIN_BUTTON).click();
    }

    public void clickLinkedinButton() {
        driver.findElement(LINKEDIN_BUTTON).click();
    }

    public void loginPage() {
        driver.get(Urls.REGISTER_FORM_URL);
        driver.findElement(USERNAME_INPUT).sendKeys(Credentials.USERNAME1);
        driver.findElement(PASSWORD_INPUT).sendKeys(Credentials.PASSWORD);
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        byte[] sourceFile = takesScreenshot.getScreenshotAs(OutputType.BYTES);
        try {
            String path = String.format("src/test/resources/%s_screenshot.png", "today");
            Files.write(Paths.get(path), sourceFile);
        } catch (IOException e) {
           e.printStackTrace();
        }
        driver.findElement(LOGIN_BUTTON).click();
    }

    public void switchToNewTab() {
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
    }

    public boolean logoLinkedin() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 5);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(LOGO_LINKEDIN));
        boolean textLogo = driver.findElement(LOGO_LINKEDIN).isDisplayed();
        return textLogo;
    }
}