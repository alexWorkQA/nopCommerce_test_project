package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {
        app.commonHelper.openWebSite();
        app.mainPageHelper.openLoginPage();
    }
}
