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
    public void NegativeLoginTestEmptyEmail() {
        app.navigationHelper.openLoginPageViaURL();
        app.loginHelper.loginUser(testWOEmailUser);
        String expectedErrorMessage = "Please enter your email";
        Assert.assertEquals(expectedErrorMessage,app.loginHelper.getEmailErrorMessage());
    }

    @Test
    public void NegativeLoginTestEmptyPassword(){
        app.navigationHelper.openLoginPageViaURL();
        app.loginHelper.loginUser(testWOPasswordUser);
        String expectedErrorMessage = "Login was unsuccessful.";
        String actualErrorMessage = app.loginHelper.getValidationErrorMessage();
        Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage));
    }

    @AfterMethod
    public void finalize() {
        app.navigationHelper.openMainPageViaUrl();
        // app.loginHelper.logout();
    }
}
