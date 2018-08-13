package Functional;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RefactoredRegistrationTest extends BaseTest {

    @BeforeMethod
    public void initialization() {
        app.start();
        app.navigationHelper.openRegistrationPage();
    }

    @Test
    public void PositiveRegistrationTestSimpleValidUser() {
        app.registrationHelper.registrateValidUser(testValidUser);
        String expectedResult = "Your registration completed";
        Assert.assertEquals(expectedResult, app.registrationHelper.getAssertMessage());
    }

    @AfterMethod
    public void finalize() {
        app.navigationHelper.openMainPage();
        app.loginHelper.logout();
    }
}
