package Functional;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RefactoredLoginTest extends BaseTest {

    @BeforeMethod
    public void initialization() {
        //register new user
        app.start();
        app.navigationHelper.openRegistrationPage();
        app.registrationHelper.registrateValidUser(testValidUser);
        app.registrationHelper.completeRegistration();
        app.navigationHelper.openMainPage();
        app.loginHelper.logout();

    }

    @Test
    public void PositiveLoginTest() {
        app.navigationHelper.openMainPage();
        app.navigationHelper.openLoginPage();
        app.loginHelper.loginValidUser(testValidUser);
        app.navigationHelper.openAccountPage();
        Assert.assertEquals(testValidUser, app.loginHelper.getLoggedInUser());
    }

    @AfterMethod
    public void finalize() {
        app.navigationHelper.openMainPage();
        app.loginHelper.logout();
    }
}
