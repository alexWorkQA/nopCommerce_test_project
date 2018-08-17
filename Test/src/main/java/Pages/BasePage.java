package Pages;

import Factories.WebDriverFactory;
import Factories.WebSiteFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public abstract class BasePage {

    protected static WebDriver driver;
    private static WebDriverWait wait;

    static {
        driver = WebDriverFactory.getDriverInstance();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,30);
    }

    public BasePage() {
        PageFactory.initElements(driver, this);
    }

    void waitForVisibilityOf(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void visit(){
        driver.get(WebSiteFactory.getSite().siteUrl);
    }

    public void closeWebApp(){
        driver.quit();
    }

/*    public void click(WebElement element){
        waitForVisibilityOf(element);
        element.click();
    }*/

/*    public void sendKey(WebElement element, String key){
        waitForVisibilityOf(element);
        element.sendKeys(key);
    }*/
}
