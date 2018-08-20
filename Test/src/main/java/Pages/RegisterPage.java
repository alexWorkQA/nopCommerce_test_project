package Pages;

import Models.User;
import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RegisterPage extends BasePage {

    @FindBy(xpath = ".//input[@id='FirstName']")
    private WebElement fisrtNameField;

    @FindBy(xpath = ".//input[@id='LastName']")
    private WebElement lastNameField;

    @FindBy(xpath = ".//input[@id='Email']")
    private WebElement emailField;

    @FindBy(xpath = ".//input[@id='Password']")
    private WebElement passwordField;

    @FindBy(xpath = ".//input[@id='ConfirmPassword']")
    private WebElement confirmPasswordField;

    @FindBy(xpath = ".//input[@id='register-button']")
    private WebElement registerButton;

    @FindBy(xpath = ".//span[@id='FirstName-error']")
    private WebElement fNameErrorMessage;

    @FindBy(xpath = ".//span[@id='LastName-error']")
    private WebElement lNameErrorMessage;

    @FindBy(xpath = ".//span[@id='Email-error']")
    private WebElement eMailErrorMessage;

    @FindBy(xpath = ".//span[@id='Password-error']")
    private WebElement passordErrorMessage;

    public RegisterResultPage fillOutForm(User user) {
        fisrtNameField.sendKeys(user.getFirstname());
        lastNameField.sendKeys(user.getLastname());
        emailField.sendKeys(user.getEmail());
        passwordField.sendKeys(user.getPassword());
        confirmPasswordField.sendKeys(user.getPassword());
        registerButton.click();
        return new RegisterResultPage();
    }

    public String getFNameErrorMessage() {
        waitForVisibilityOf(fNameErrorMessage);
        return fNameErrorMessage.getText();
    }

    public String getLNameErrorMessage() {
        waitForVisibilityOf(lNameErrorMessage);
        return lNameErrorMessage.getText();
    }

    public String getEMailErrorMessage() {
        waitForVisibilityOf(eMailErrorMessage);
        return eMailErrorMessage.getText();
    }

    public String getPasswordErrorMessage() {
        waitForVisibilityOf(passordErrorMessage);
        return passordErrorMessage.getText();
    }
}
