package Functional;

import org.testng.Assert;
import org.testng.annotations.*;
import java.text.NumberFormat;
import java.util.Locale;

public class AddToCartProducts extends AddToCartTests {

    private double priceAsus;
    private double priceHPEnvy6;

    @BeforeClass(description = "Registration step is necessary because of user is expired in unknown period of time")
    public void addTwoItemsToTheShoppingCart() {
        app.navigationHelper.openMainPageViaUrl();
        app.navigationHelper.openComputerPage();
        app.navigationHelper.openNotebooksPage();
        app.productHelper.selectAsusN551();
        priceAsus = app.productHelper.getItemPrice();
        app.productHelper.addItemToCart();
        app.navigationHelper.openMainPageViaUrl();
        app.navigationHelper.openComputerPage();
        app.navigationHelper.openNotebooksPage();
        app.productHelper.selectHPEnvy6();
        priceHPEnvy6 = app.productHelper.getItemPrice();
        app.productHelper.addItemToCart();
        app.navigationHelper.openMainPageViaUrl();
        app.navigationHelper.openShoppingCartPage();
        actualTotalPrice = app.shoppingCartHelper.getTotalPrice();
        products = app.shoppingCartHelper.getProductsList();
        format = NumberFormat.getCurrencyInstance(Locale.US);
    }

    @Test(description = "Total price = price Asus + price HP Envy")
    public void totalPriceShouldIncludePricesForBouthItems() {
        String expectedTotalPrice = format.format(priceAsus + priceHPEnvy6);
        Assert.assertEquals(expectedTotalPrice, actualTotalPrice);
    }

    @Test(description = "Items should be shown in the list")
    public void itemsWasAddedToTheList(){
        Assert.assertEquals(products.get(0).getName(), "Asus N551JK-XO076H Laptop");
        Assert.assertEquals(products.get(1).getName(), "HP Envy 6-1180ca 15.6-Inch Sleekbook");
    }

    @AfterClass
    public void finalize() {
        app.navigationHelper.openMainPageViaUrl();
        app.loginHelper.logout();
    }
}
