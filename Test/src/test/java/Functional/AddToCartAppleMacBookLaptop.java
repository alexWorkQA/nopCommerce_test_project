package Functional;

import Models.Product;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class AddToCartAppleMacBookLaptop extends BaseTest {

    @BeforeMethod(description = "Registration step is necessary because of user is expired in unknown period of time")
    public void initialization() {
        //register new user
        app.start();
        app.navigationHelper.openRegistrationPage();
        app.registrationHelper.registrateUser(testValidUser);
        app.registrationHelper.completeRegistration();
        app.navigationHelper.openMainPageViaUrl();
    }

    @Test(description = "User is able to add to cart Apple Mac Book, total price should be increased in twice")
    public void PositiveTestAddToCartAppleMacBookLaptop() {
        app.navigationHelper.openComputerPage();
        app.navigationHelper.openNotebooksPage();
        app.productHelper.selectAppleMacBookPro();
        double price = app.productHelper.getItemPrice();
        app.productHelper.addItemToCart();
        app.navigationHelper.openShoppingCartPage();
        String totalPrice = app.shoppingCartHelper.getTotalPrice();
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
        //price should be doubled because "This product has a minimum quantity of 2" for Apple MacBook Pro 13-inch
        String expectedResult = format.format(price * 2);
        Assert.assertEquals(expectedResult, totalPrice);
        List<Product> products = app.shoppingCartHelper.getProductsList();
        Assert.assertEquals(products.get(0).getName(), "Apple MacBook Pro 13-inch");
    }

    @AfterMethod
    public void finalize() {
        app.navigationHelper.openMainPageViaUrl();
        app.loginHelper.logout();
    }
}
