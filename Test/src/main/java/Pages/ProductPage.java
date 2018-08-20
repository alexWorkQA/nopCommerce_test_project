package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    @FindBy(xpath = ".//input[@value='Add to cart']")
    private WebElement addToCartButton;

    @FindBy(xpath = ".//span[@itemprop='price']")
    private WebElement price;

    @FindBy(xpath = ".//p[@calss='content']")
    private WebElement informativeMessage;

    public ProductPage clickAddToCartButton() {
        addToCartButton.click();
        return this;
    }

    public String getProductPrice() {
        return price.getAttribute("content");
    }
    public String getInformativeMessage(){
        waitForVisibilityOf(informativeMessage);
        return informativeMessage.getText();
    }

}
