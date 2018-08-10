package Pages;

import Factories.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public abstract class BasePage {

    protected static WebDriver driver;
    protected static WebDriverWait wait;

    static {
        driver = WebDriverFactory.getDriverInstance();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,30);
    }

    protected BasePage() {
        PageFactory.initElements(driver, this);
    }

    protected void waitForVisibilityOf(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
