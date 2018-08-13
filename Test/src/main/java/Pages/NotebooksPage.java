package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotebooksPage extends BasePage {

    @FindBy(xpath=".//a[@href='/apple-macbook-pro-13-inch']")
    private WebElement appleMacBookLink;

    public ProductPage selectMacBook(){
        waitForVisibilityOf(appleMacBookLink);
        appleMacBookLink.click();
        return new ProductPage();
    }

}
