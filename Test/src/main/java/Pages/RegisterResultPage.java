package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegisterResultPage extends BasePage {

    @FindBy(xpath = ".//div[@class='result']")
    private WebElement resultMessage;

    @FindBy(xpath = ".//input[@name='register-continue']")
    private WebElement continueButton;

    protected String getMessage() {
        return resultMessage.getText();
    }

    protected MainPage clickContinue() {
        continueButton.click();
        return new MainPage();
    }
}
