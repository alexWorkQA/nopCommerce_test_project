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


    protected LoginPage clickLogInButton(){
        loginButton.click();
        return new LoginPage();
    }

    protected void clickMyAccountButton(){
        myAccountButton.click();
    }
}
