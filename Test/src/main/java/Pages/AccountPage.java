package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {

    @FindBy(xpath = ".//input[@id='FirstName']")
    private WebElement fisrtNameField;

    @FindBy(xpath = ".//input[@id='LastName']")
    private WebElement lastNameField;

    @FindBy(xpath = ".//input[@id='Email']")
    private WebElement emailField;

    public String getFisrtName() {
        return fisrtNameField.getAttribute("value");
    }

    public String getLastName() {
        return lastNameField.getAttribute("value");
    }

    public String getEmail() {
        return emailField.getAttribute("value");
    }
}
