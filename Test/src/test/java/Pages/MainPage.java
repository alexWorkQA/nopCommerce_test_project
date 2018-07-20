package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    public MainPage() {
    }

    //MainPage Elements

    //LogIn button
    @FindBy(xpath=".//a[@href='/login']")
   private WebElement loginButton;

    @FindBy(xpath=".//a[@class='ico-account']")
    private WebElement myAccountButton;

    @FindBy(xpath=".//a[@href='/register']")
    private WebElement registerButton;


    protected LoginPage clickLogInButton(){
        loginButton.click();
        return new LoginPage();
    }

    protected AccountPage clickMyAccountButton(){
        myAccountButton.click();
        return new AccountPage();
    }

    protected RegisterPage clickRegisterButton(){
        registerButton.click();
        return new RegisterPage();
    }
}
