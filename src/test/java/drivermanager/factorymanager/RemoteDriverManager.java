package drivermanager.factorymanager;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class RemoteDriverManager extends DriverManager {
    @Override
    public void createDriver() {
        SafariOptions browserOptions = new SafariOptions();
        browserOptions.setCapability("platformName", "macOS 12");
        browserOptions.setCapability("browserVersion", "15");
        Map<String, Object> sauceOptions = new HashMap<>();
        sauceOptions.put("build", "1");
        sauceOptions.put("name", "<Add Cart SauceDemo>");
        browserOptions.setCapability("sauce:options", sauceOptions);
        try {
            driver = new RemoteWebDriver( new URL("https://oauth-andrei92d-7de88:10f23fd7-87e9-479f-8a08-638af87100a6@ondemand.eu-central-1.saucelabs.com:443/wd/hub"), browserOptions);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
