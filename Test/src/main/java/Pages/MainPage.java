package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    public MainPage() {
    }

    //MainPage Elements

    //LogIn button
    @FindBy(xpath = ".//a[@href='/login']")
    private WebElement loginButton;

    @FindBy(xpath = ".//a[@class='ico-account']")
    private WebElement myAccountButton;

    @FindBy(xpath = ".//a[@href='/register']")
    private WebElement registerButton;

    @FindBy(xpath = ".//a[@href='/logout']")
    private WebElement logoutButton;

    @FindBy(xpath = ".//a[@href='/computers']")
    private WebElement computersLink;

    @FindBy(xpath=".//span[@class='cart-label']")
    private WebElement shoppingCartLink;


    //MainPage methods
    public LoginPage clickLogInButton() {
        loginButton.click();
        return new LoginPage();
    }

    public AccountPage clickMyAccountButton() {
        myAccountButton.click();
        return new AccountPage();
    }

    public RegisterPage clickRegisterButton() {
        waitForVisibilityOf(registerButton);
        registerButton.click();
        return new RegisterPage();
    }

    public MainPage clickLogoutButton() {
        logoutButton.click();
        return new MainPage();
    }

    public ComputersPage clickComputersLink(){
        computersLink.click();
        return new ComputersPage();
    }

    public ShoppingCartPage clickShoppingCartLink(){
        waitForVisibilityOf(shoppingCartLink);
        shoppingCartLink.click();
        return new ShoppingCartPage();
    }
}
