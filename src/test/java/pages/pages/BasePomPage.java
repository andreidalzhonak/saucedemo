package pages.pages;

import org.openqa.selenium.WebDriver;

public class BasePomPage {
    public WebDriver driver;

    public BasePomPage(WebDriver driver) {
        this.driver = driver;
    }
}
