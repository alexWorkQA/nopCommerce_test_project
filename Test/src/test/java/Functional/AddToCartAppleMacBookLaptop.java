package Functional;

import org.testng.Assert;
import org.testng.annotations.*;

public class AddToCartAppleMacBookLaptop extends AddToCartTests {

    private double price;

    @BeforeClass(description = "Registration step is necessary because of user is expired in unknown period of time")
    public void addMacBookToTheShoppingCart() {
        app.navigationHelper.openMainPageViaUrl();
        app.navigationHelper.openComputerPage();
        app.navigationHelper.openNotebooksPage();
        app.productHelper.selectAppleMacBookPro();
        //price should be doubled because "This product has a minimum quantity of 2" for Apple MacBook Pro 13-inch
        expectedTotalPrice.add(app.productHelper.getItemPrice());
        expectedTotalPrice.add(app.productHelper.getItemPrice());
        app.productHelper.addItemToCart();
        app.navigationHelper.openShoppingCartPage();
        actualTotalPrice = app.shoppingCartHelper.getTotalPrice();
        products = app.shoppingCartHelper.getProductsList();
    }

    @Test(description = "User is able to add to cart Apple Mac Book, total price should be increased in twice")
    public void priceShouldBeIncreased() {
        String expectedResult = getExpectedTotalPrice(expectedTotalPrice);
        Assert.assertEquals(expectedResult, actualTotalPrice);
    }

    @Test(description = "User is able to add to cart Apple Mac Book, product should be added to the Shopping Cart")
    public void productShouldBeAddedToTheCart() {
        Assert.assertEquals(products.get(0).getName(), "Apple MacBook Pro 13-inch");
    }


    @AfterClass
    public void finalize() {
        app.navigationHelper.openMainPageViaUrl();
        app.loginHelper.logout();
    }
}
