package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {

    @FindBy(xpath=".//input[@id='FirstName']")
    private WebElement fisrtNameField;

    @FindBy(xpath=".//input[@id='LastName']")
    private WebElement lastNameField;

    @FindBy(xpath=".//input[@id='Email']")
    private WebElement emailField;

    protected String getFisrtName(){
        return fisrtNameField.getAttribute("value");
    }

    protected String getLastName(){
        return lastNameField.getAttribute("value");
    }

    protected String getEmail(){
        return emailField.getAttribute("value");
    }
}
