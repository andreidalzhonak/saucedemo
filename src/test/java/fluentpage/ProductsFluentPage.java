package fluentpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.pages.BasePomPage;

public class ProductsFluentPage extends BasePomPage {
    public ProductsFluentPage(WebDriver driver) {
        super(driver);
    }

    private By ADD_TO_CART = By.cssSelector("#add-to-cart-sauce-labs-backpack");
    private By SHOPPING_CART = By.xpath("//*[@id=\"shopping_cart_container\"]/a");

    public ProductsFluentPage addToCart() {
        driver.findElement(ADD_TO_CART).click();
        return this;
    }

    public ProductsFluentPage addShoppingCart() {
        driver.findElement(SHOPPING_CART).click();
        return this;
    }
    public ProductsFluentPage shoppingCart () {
        driver.findElement(ADD_TO_CART).click();
        driver.findElement(SHOPPING_CART).click();
        return this;
    }
}
