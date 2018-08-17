package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotebooksPage extends BasePage {

    @FindBy(xpath = ".//a[@href='/apple-macbook-pro-13-inch']")
    private WebElement appleMacBookLink;

    @FindBy(xpath = ".//a[@href='/asus-n551jk-xo076h-laptop']")
    private WebElement asusN551jk;

    @FindBy(xpath = ".//a[@href='/hp-envy-6-1180ca-156-inch-sleekbook']")
    private WebElement hpEnvy6;

    public ProductPage selectMacBook() {
        waitForVisibilityOf(appleMacBookLink);
        appleMacBookLink.click();
        return new ProductPage();
    }

    public ProductPage selectAsusN551() {
        waitForVisibilityOf(asusN551jk);
        asusN551jk.click();
        return new ProductPage();
    }

    public ProductPage selecthpEnvy6() {
        waitForVisibilityOf(hpEnvy6);
        hpEnvy6.click();
        return new ProductPage();
    }
}
