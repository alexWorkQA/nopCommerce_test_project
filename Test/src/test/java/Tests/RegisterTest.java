package Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    @BeforeMethod
    public void openWebSite() {
     app.commonHelper.openWebSite();
     app.mainPageHelper.openRegisterPage();
    }

    @Test
    public void registerTest() {
       app.registerPageHelper.registerValidUser(testValidUser);
       String actualResult = app.registerResultPageHelper.getMessageForAssert();
       String expectedResult = "Your registration completed";
        Assert.assertEquals(actualResult,expectedResult);

    }
}
