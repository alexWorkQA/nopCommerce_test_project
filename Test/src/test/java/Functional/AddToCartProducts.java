package Functional;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.NumberFormat;
import java.util.Locale;

public class AddToCartProducts extends BaseTest {

    @BeforeMethod(description = "Registration step is necessary because of user is expired in unknown period of time")
    public void initialization() {
        //register new user
        app.start();
        app.navigationHelper.openRegistrationPage();
        app.registrationHelper.registrateValidUser(testValidUser);
        app.registrationHelper.completeRegistration();
        app.navigationHelper.openMainPageViaUrl();
    }

    @Test(description = "User is able to add to cart two products from the same category")
    public void AddToCart2Products() {
        app.navigationHelper.openMainPageViaUrl();
        app.navigationHelper.openComputerPage();
        app.navigationHelper.openNotebooksPage();
        app.productHelper.selectAsusN551();
        double priceAsus = app.productHelper.getItemPrice();
        app.productHelper.addItemToCart();
        app.navigationHelper.openMainPageViaUrl();
        app.navigationHelper.openComputerPage();
        app.navigationHelper.openNotebooksPage();
        app.productHelper.selectHPEnvy6();
        double priceHPEnvy6 = app.productHelper.getItemPrice();
        app.productHelper.addItemToCart();
        app.navigationHelper.openMainPageViaUrl();
        app.navigationHelper.openShoppingCartPage();
        String actualTotalPrice = app.shoppingCartHelper.getTotalPrice();
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
        String expectedTotalPrice = format.format(priceAsus + priceHPEnvy6);
        Assert.assertEquals(expectedTotalPrice, actualTotalPrice);
    }

    @AfterMethod
    public void finalize() {
        app.navigationHelper.openMainPageViaUrl();
        app.loginHelper.logout();
    }
}
