package Pages;

import Factories.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BasePage {

    protected static WebDriver driver;

    static {
        driver = WebDriverFactory.getDriverInstance();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }

    public BasePage() {
        PageFactory.initElements(driver, this);
    }
}
