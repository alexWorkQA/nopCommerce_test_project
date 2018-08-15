package Functional;

import Models.Product;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class RefactoredAddToCartAppleMacBookLaptop extends BaseTest {
    private List<Product> products;

    @BeforeMethod
    public void initialization() {
        //register new user
        app.start();
        app.navigationHelper.openRegistrationPage();
        app.registrationHelper.registrateValidUser(testValidUser);
        app.registrationHelper.completeRegistration();
        app.navigationHelper.openMainPage();
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
        String expectedResult = format.format(price * 2);
        Assert.assertEquals(expectedResult, totalPrice);
        products = app.shoppingCartHelper.getProductsList();
        Assert.assertEquals(true, true);

    }

}
