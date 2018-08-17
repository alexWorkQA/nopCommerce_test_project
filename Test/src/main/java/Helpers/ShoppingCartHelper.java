package Helpers;

import Factories.PageFactory;
import Models.Product;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartHelper {

    public String getTotalPrice() {
        String price = PageFactory.shoppingCartPage.getTotalPrice();
        return price;
    }

    public List<Product> getProductsList() {
        List<Product> products = new ArrayList<>();
        List<WebElement> webproducts = PageFactory.shoppingCartPage.getProductsList();
        for (WebElement webproduct : webproducts
        ) {
            Product product = new Product();
            product.setName(webproduct.getText());
            products.add(product);
        }
        return products;
    }
}
