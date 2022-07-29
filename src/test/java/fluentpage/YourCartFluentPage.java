package fluentpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.pages.BasePomPage;

public class YourCartFluentPage extends BasePomPage {
    public YourCartFluentPage(WebDriver driver) {
        super(driver);
    }

    private By ITEM_NAME = By.xpath("//*[@id=\"item_4_title_link\"]/div");
    private By ITEM_PRICE = By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[2]/div");

    public String takeItemName() {
        String itemName = driver.findElement(ITEM_NAME).getText();
        return itemName;
    }

    public String takeItemPrice() {
        String itemName = driver.findElement(ITEM_PRICE).getText();
        return itemName;
    }
}

