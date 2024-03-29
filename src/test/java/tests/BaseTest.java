package tests;

import drivermanager.factorymanager.DriverFactory;
import drivermanager.factorymanager.DriverManager;
import drivermanager.factorymanager.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utils.TestListeners;
@Listeners(TestListeners.class)
public class BaseTest {

    public WebDriver driver;
    public DriverManager driverManager;

    @BeforeTest
    @Parameters({"browser"})
    public void setUp(@Optional("chrome") String browser) {
        DriverFactory driverFactory = new DriverFactory();
        DriverType type = null;
        if(browser.equals("chrome")) {
            type = DriverType.CHROME;
        } else if (browser.equals("firefox")){
            type = DriverType.FIREFOX;
        }
        driverManager = driverFactory.getManager(type);
        driverManager.createDriver();
        driverManager.setTimeout();
        driverManager.startMaximize();
        driver = driverManager.getDriver();
    }
    public WebDriver getDriver() {
        return driver;
    }

    @AfterTest(alwaysRun = true)
    public void tearDown() {
        driverManager.quitDriver();
    }
}

