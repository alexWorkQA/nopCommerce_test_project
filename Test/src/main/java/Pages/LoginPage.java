package Pages;

import Factories.UserFactory;
import Models.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{



    @FindBy(xpath=".//input[@id='Email']")
    private WebElement email;

    @FindBy(xpath=".//input[@id='Password']")
    private WebElement password;

    @FindBy(xpath=".//input[@class='button-1 login-button']")
    private WebElement loginButton;

    public MainPage loginToSite(User user){
        email.sendKeys(user.getEmail());
        password.sendKeys(user.getPassword());
        loginButton.click();
       return new MainPage();
    }
}
