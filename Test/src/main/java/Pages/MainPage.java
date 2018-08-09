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


    //MainPage methods
    protected LoginPage clickLogInButton() {
        loginButton.click();
        return new LoginPage();
    }

    protected AccountPage clickMyAccountButton() {
        myAccountButton.click();
        return new AccountPage();
    }

    protected RegisterPage clickRegisterButton() {
        registerButton.click();
        return new RegisterPage();
    }

    protected MainPage clickLogoutButton() {
        logoutButton.click();
        return new MainPage();
    }

    protected ComputersPage clickComputersLink(){
        computersLink.click();
        return new ComputersPage();
    }
}
