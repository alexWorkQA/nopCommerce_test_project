package Pages;

import Models.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{

    @FindBy(xpath=".//input[@id='FirstName']")
    private WebElement fisrtNameField;

    @FindBy(xpath=".//input[@id='LastName']")
    private WebElement lastNameField;

    @FindBy(xpath=".//input[@id='Email']")
    private WebElement emailField;

    @FindBy(xpath=".//input[@id='Password']")
    private WebElement passwordField;

    @FindBy(xpath=".//input[@id='ConfirmPassword']")
    private WebElement confirmPasswordField;

    @FindBy(xpath=".//input[@id='register-button']")
    private WebElement registerButton;

    protected RegisterResultPage fillOutForm(User user){
        fisrtNameField.sendKeys(user.getFirstname());
        lastNameField.sendKeys(user.getLastname());
        registerButton.click();
        return new RegisterResultPage();
    }

}
