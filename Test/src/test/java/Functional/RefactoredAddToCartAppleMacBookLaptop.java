package Functional;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RefactoredAddToCartAppleMacBookLaptop extends BaseTest {
    @BeforeMethod
    public void initialization() {
        //register new user
        app.start();
        app.navigationHelper.openRegistrationPage();
        app.registrationHelper.registrateValidUser(testValidUser);
        app.registrationHelper.completeRegistration();
        app.navigationHelper.openMainPage();
    }

    @Test
    public void PositiveTestAddToCartAppleMacBookLaptop() {
        app.navigationHelper.openComputerPage();
        app.navigationHelper.openNotebooksPage();
        app.productHelper.selectAppleMacBookPro();
        double price = app.productHelper.getItemPrice();
//        Assert.assertEquals(1800.00, price);
        app.productHelper.addItemToCart();



        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
