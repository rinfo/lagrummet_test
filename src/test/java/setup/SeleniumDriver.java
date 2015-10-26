package setup;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumDriver {

    static WebDriver driver;
    public static JSONParser parser;
    public static JSONArray jsonArray;

    public static final String USERNAME = System.getProperty("lagrummet.browserstack.username");
    public static final String AUTOMATE_KEY = System.getProperty("lagrummet.browserstack.automatekey");
    public static final String REMOTE_URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";


    public static WebDriver getDriver() {
        if (driver == null) {
            if (USERNAME != null && AUTOMATE_KEY != null) {
                try {
                    driver = new RemoteWebDriver(new URL(REMOTE_URL), getCaps());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                new FirefoxDriver();
            }
        }
        return driver;
    }

    private static DesiredCapabilities getCaps() throws Exception {
        parser = new JSONParser();
        Object obj = parser.parse(new FileReader("src/test/resources/browsers.json"));//path where your JSON file is stored
        jsonArray = (JSONArray) obj;

        JSONObject j = (JSONObject) jsonArray.get(Integer.parseInt(System.getProperty("lagrummet.browser.id")) - 1);

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.safari();
        caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        caps.setCapability("browserstack.debug", "true");
        caps.setCapability("resolution", "1920x1080");

        caps.setCapability("browser", j.get("browser"));
        caps.setCapability("browser_version", j.get("browser_version"));
        caps.setCapability("os", j.get("os"));
        caps.setCapability("os_version", j.get("os_version"));

        return caps;
    }

    public static boolean isDisplayed(WebElement webElement) {
        return webElement.isDisplayed();
    }

    public static void clickOn(WebElement webElement) {
        webElement.click();
    }
}