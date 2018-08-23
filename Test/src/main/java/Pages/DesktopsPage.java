package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage extends BasePage {

    @FindBy(xpath=".//a[@href='/build-your-own-computer']")
    private WebElement createOwnBuildLink;

    public ProductPage selectOwnBuild(){
        waitForVisibilityOf(createOwnBuildLink);
        createOwnBuildLink.click();
        return new ProductPage();
    }

}
