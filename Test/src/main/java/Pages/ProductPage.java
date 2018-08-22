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

    @FindBy(xpath=".//input[@id='product_attribute_5_11']")
    private WebElement ownBuildAcrobatReader;

    @FindBy(xpath=".//input[@id='product_attribute_4_9']")
    private WebElement ownBuildVistaPremium;

    public ProductPage clickAddToCartButton() {
        addToCartButton.click();
        return this;
    }

    public ProductPage addAcrobatReaderToOwnBuild(){
        waitForVisibilityOf(ownBuildAcrobatReader);
        if (!ownBuildAcrobatReader.isSelected())
        ownBuildAcrobatReader.click();
        return this;
    }

    public String getProductPrice() {
        return price.getAttribute("content");
    }

    public String getPrice(){
        return price.getText();
    }

    public String getInformativeMessage(){
        waitForVisibilityOf(informativeMessage);
        return informativeMessage.getText();
    }

    public void waitForPriceChanged(String value){
        while(price.getText().equalsIgnoreCase(value)){
            String blue = "Test";
        }
    }

    public ProductPage selectVistaPremium(){
        waitForVisibilityOf(ownBuildVistaPremium);
        ownBuildVistaPremium.click();
        return this;
    }
}
