package Functional;

import org.testng.Assert;
import org.testng.annotations.*;

public class AddToCartProductsTest extends AddToCartTests {

    @BeforeClass(description = "Registration step is necessary because of user is expired in unknown period of time")
    public void addTwoItemsToTheShoppingCart() {
        app.navigationHelper.openMainPageViaUrl();
        app.navigationHelper.openComputerPage();
        app.navigationHelper.openNotebooksPage();
        app.productHelper.selectAsusN551();
        expectedTotalPrice.add(app.productHelper.getItemPrice());
        app.productHelper.addItemToCart();
        app.navigationHelper.openMainPageViaUrl();
        app.navigationHelper.openComputerPage();
        app.navigationHelper.openNotebooksPage();
        app.productHelper.selectHPEnvy6();
        expectedTotalPrice.add(app.productHelper.getItemPrice());
        app.productHelper.addItemToCart();
        app.navigationHelper.openMainPageViaUrl();
        app.navigationHelper.openShoppingCartPage();
        actualTotalPrice = app.shoppingCartHelper.getTotalPrice();
        products = app.shoppingCartHelper.getProductsList();
        //format = NumberFormat.getCurrencyInstance(Locale.US);
    }

    @Test(description = "Total price = price Asus + price HP Envy")
    public void totalPriceShouldIncludePricesForBouthItems() {
        String expectedResult = getExpectedTotalPrice(expectedTotalPrice);
        Assert.assertEquals(expectedResult, actualTotalPrice);
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
