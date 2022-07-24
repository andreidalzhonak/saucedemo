package pages.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPomPage extends BasePomPage {
    public ProductsPomPage(WebDriver driver) {
        super(driver);
    }

    private By ADD_TO_CART = By.cssSelector("#add-to-cart-sauce-labs-backpack");
    private By SHOPPING_CART = By.xpath("//*[@id=\"shopping_cart_container\"]/a");

    public void addToCart() {
        driver.findElement(ADD_TO_CART).click();
    }

    public void addShoppingCart() {
        driver.findElement(SHOPPING_CART).click();
    }
}
