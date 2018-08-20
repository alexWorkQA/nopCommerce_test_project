package Functional;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {

    @BeforeMethod
    public void initialization() {
        app.start();
        app.navigationHelper.openRegistrationPage();
    }

    @Test
    public void PositiveRegistrationTestSimpleValidUser() {
        app.registrationHelper.registrateUser(testValidUser);
        String expectedResult = "Your registration completed";
        Assert.assertEquals(expectedResult, app.registrationHelper.getAssertMessage());
    }

    @Test
    public void NegativeRegistrationTestUserWithoutFName() {
        app.registrationHelper.registrateUser(testWOFNameUser);
        String expectedErrorMessage = "First name is required.";
        Assert.assertEquals(expectedErrorMessage, app.registrationHelper.getFNameErrorMessage());
    }


    @Test
    public void NegativeRegistrationTestUserWithoutSName() {
        app.registrationHelper.registrateUser(testWOLNameUser);
        String expectedErrorMessage = "Last name is required.";
        Assert.assertEquals(expectedErrorMessage, app.registrationHelper.getLNameErrorMessage());
    }

    @Test
    public void NegativeRegistrationTestUserWithoutEmail() {
        app.registrationHelper.registrateUser(testWOEmailUser);
        String expectedErrorMessage = "Email is required.";
        Assert.assertEquals(expectedErrorMessage, app.registrationHelper.getEMailErrorMessage());
    }

    @Test
    public void NegativeRegistrationTestUserWithoutPassword(){
        app.registrationHelper.registrateUser(testWOPasswordUser);
        String expectedErrorMessage = "Password is required.";
        Assert.assertEquals(expectedErrorMessage,app.registrationHelper.getPasswordErrorMessage());
    }


    @AfterMethod
    public void finalize() {
        app.navigationHelper.openMainPageViaUrl();
        // app.loginHelper.logout();
    }
}
