package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    @FindBy(xpath=".//input[@value='Add to cart']")
    private WebElement addToCartButton;

    protected ProductPage clickAddToCartButton(){
        addToCartButton.click();
        return this;
    }

}
