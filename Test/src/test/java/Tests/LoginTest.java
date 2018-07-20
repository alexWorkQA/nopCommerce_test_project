package Tests;

import Factories.UserFactory;
import Models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    User testValidUser;

    @BeforeMethod
    public void testDateInitialization() {
        testValidUser = UserFactory.getValidUser();
    }

    @Test
    public void loginTest() {
        app.commonHelper.openWebSite();
        app.mainPageHelper.openLoginPage();
        app.loginPageHelper.loginAsValidUser(testValidUser);
        app.mainPageHelper.openAccountPage();
        User actualUser = app.accountPageHelper.getUser();
        Assert.assertEquals(testValidUser,actualUser);
    }
}
