package tests;


import drivermanager.factorymanager.DriverType;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.*;
import threadlocalmanager.DriverThreadLocalManager;
import threadlocalmanager.DriverThreadLocalManagerFactory;



public class BaseWithThreadLocalTest {

    DriverThreadLocalManager driverManager;

    @BeforeMethod
    public void createManager() {
        DriverThreadLocalManagerFactory factory = new DriverThreadLocalManagerFactory();
        driverManager = factory.getManager(DriverType.CHROME);
    }

    @BeforeMethod
    public void setUp() {
        driverManager.createDriver();
        driverManager.startMaximize();
        driverManager.setTimeout();
    }

    public WebDriver getDriver() {
        return driverManager.getDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driverManager.getDriver().quit();
    }
}
