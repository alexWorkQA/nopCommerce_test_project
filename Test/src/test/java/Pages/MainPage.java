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


    protected void clickLogInButton(){
        loginButton.click();
    }
}
