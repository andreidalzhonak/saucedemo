package tests;

import constants.Credentials;
import constants.Urls;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SauceDemoTest extends BaseTest {
    @Test
    public void addCartTest() {
        //Open url of saucedemo
        driver.get(Urls.REGISTER_FORM_URL);
        //Input username
        driver.findElement(By.id("user-name")).sendKeys(Credentials.Username);
        //Input password
        driver.findElement(By.id("password")).sendKeys(Credentials.Password);
        //Click 'Login'
        driver.findElement(By.id("login-button")).click();
        //Click "Add to cart"
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        //Add check itemName
        String itemName = driver.findElement(By.cssSelector("#item_4_title_link > div")).getText();
        Assert.assertEquals(itemName, "Sauce Labs Backpack");
        //Add check price itemName
        String price = driver.findElement(By.cssSelector(".inventory_item_price")).getText();
        Assert.assertEquals(price, "$29.99");
    }
}
