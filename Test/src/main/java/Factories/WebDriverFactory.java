package Factories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {

    public static final String CHROME = "chrome";
    private static WebDriver driver = null;

    public static WebDriver getDriverInstance() {
        if (driver != null) {
            return driver;
        } else {
            System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
            driver = new ChromeDriver();
            return driver;
        }
    }
}
