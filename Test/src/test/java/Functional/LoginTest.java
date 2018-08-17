package Functional;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @BeforeMethod(description = "Registration step is necessary because of user is expired in unknown period of time")
    public void initialization() {
        //register new user
        app.start();
        app.navigationHelper.openRegistrationPage();
        app.registrationHelper.registrateUser(testValidUser);
        app.registrationHelper.completeRegistration();
        app.navigationHelper.openMainPageViaUrl();
        app.loginHelper.logout();

    }

    @Test
    public void PositiveLoginTest() {
        app.navigationHelper.openLoginPageViaURL();
        app.loginHelper.loginUser(testValidUser);
        app.navigationHelper.openAccountPage();
        Assert.assertEquals(testValidUser, app.loginHelper.getLoggedInUser());
    }

    @Test
    public void NegativeLoginTest() throws InterruptedException {
        app.navigationHelper.openLoginPageViaURL();
        app.loginHelper.loginUser(testWOFNameUser);


        Thread.sleep(2000);
    }

    @AfterMethod
    public void finalize() {
        app.navigationHelper.openMainPageViaUrl();
       // app.loginHelper.logout();
    }
}
