package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputersPage extends BasePage {

    @FindBy(xpath=".//div[@class='master-wrapper-content']//a[@href='/desktops']")
    private WebElement desktopsLink;

    @FindBy(xpath=".//div[@class='master-wrapper-content']//a[@href='/notebooks']")
    private WebElement notebooksLink;


    public DesktopsPage clickDesktopsLink(){
        waitForVisibilityOf(desktopsLink);
        desktopsLink.click();
        return new DesktopsPage();
    }

    public NotebooksPage clickNotebooksLink(){
        waitForVisibilityOf(notebooksLink);
        notebooksLink.click();
        return new NotebooksPage();
    }
}
