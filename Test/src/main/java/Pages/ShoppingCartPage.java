package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ShoppingCartPage extends BasePage {

   // @FindBy(xpath=".//td[@class='product']")
   // private WebElement products;

    @FindBy(xpath=".//span[@class='value-summary']")
    private WebElement totalPrice;

    private List<WebElement> productsName;

    public List<WebElement> getProductsList(){
        productsName = driver.findElements(By.xpath(".//a[@class='product-name']"));
        return productsName;
    }


    public String getTotalPrice(){
        waitForVisibilityOf(totalPrice);
        String price = totalPrice.getText();
        return price;
    }

}
