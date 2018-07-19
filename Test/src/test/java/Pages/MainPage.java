package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    public MainPage() {
    }

    //MainPage Elements

    //LogIn button
    @FindBy(xpath=".////a[@href='/login']")
    public WebElement loginButton;


    public void clickLogInButton(){
        loginButton.click();
    }
}
