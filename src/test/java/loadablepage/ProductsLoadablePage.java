package loadablepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.pages.BasePomPage;

public class ProductsLoadablePage extends BaseLoadablePage {
    public ProductsLoadablePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return driver.findElement(ADD_TO_CART).isDisplayed();
    }

    private By ADD_TO_CART = By.cssSelector("#add-to-cart-sauce-labs-backpack");
    private By SHOPPING_CART = By.xpath("//*[@id=\"shopping_cart_container\"]/a");

    public void addToCart() {
        driver.findElement(ADD_TO_CART).click();
    }

    public void addShoppingCart() {
        driver.findElement(SHOPPING_CART).click();
    }
    public void shoppingCart () {
        driver.findElement(ADD_TO_CART).click();
        driver.findElement(SHOPPING_CART).click();
    }
}
