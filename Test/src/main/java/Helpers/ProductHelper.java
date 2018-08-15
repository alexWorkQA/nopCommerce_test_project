package Helpers;

import Factories.PageFactory;

public class ProductHelper {

    public double getItemPrice(){
        String price = PageFactory.productPage.getProductPrice();
        return Double.parseDouble(price);
    }

    public void selectAppleMacBookPro(){
        PageFactory.notebooksPage.selectMacBook();
    }

    public void addItemToCart(){
        PageFactory.productPage.clickAddToCartButton();
    }

    public String getConfirmationMessageForAssert(){
        return PageFactory.productPage.getInformativeMessage();
    }


}
