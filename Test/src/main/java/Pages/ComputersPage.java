package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputersPage extends BasePage {

    @FindBy(xpath=".//a[@href='/desktops']")
    private WebElement desktopsLink;


    protected DesktopsPage clickDesktopsLink(){
        desktopsLink.click();
        return new DesktopsPage();
    }

}
