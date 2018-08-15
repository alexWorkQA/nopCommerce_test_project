package Factories;

import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class PageFactory extends org.openqa.selenium.support.PageFactory {


    private static WebDriver driver;
    private static WebDriverWait wait;

    public static AccountPage accountPage;
    public static LoginPage loginPage;
    public static MainPage mainPage;
    public static ComputersPage computersPage;
    public static DesktopsPage desktopsPage;
    public static NotebooksPage notebooksPage;
    public static ProductPage productPage;
    public static RegisterPage registerPage;
    public static RegisterResultPage registerResultPage;
    public static BasePage basePage;
    public static ShoppingCartPage shoppingCartPage;

    static {
        driver = WebDriverFactory.getDriverInstance();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 30);
    }

    public static void init() {
        basePage = PageFactory.initElements(driver,BasePage.class);
        accountPage = PageFactory.initElements(driver, AccountPage.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        mainPage = PageFactory.initElements(driver, MainPage.class);
        computersPage = PageFactory.initElements(driver, ComputersPage.class);
        desktopsPage = PageFactory.initElements(driver, DesktopsPage.class);
        notebooksPage = PageFactory.initElements(driver, NotebooksPage.class);
        productPage = PageFactory.initElements(driver,ProductPage.class);
        registerPage = PageFactory.initElements(driver,RegisterPage.class);
        registerResultPage = PageFactory.initElements(driver,RegisterResultPage.class);
        shoppingCartPage = PageFactory.initElements(driver,ShoppingCartPage.class);
    }
}
