package Functional;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToCartAppleMacBookTest extends BaseTest {

    @BeforeMethod
    public void initializeTests() {
        app.start();
        app.commonHelper.openWebSite();
        app.mainPageHelper.openRegisterPage();
        app.registerPageHelper.registerValidUser(testValidUser);
        app.registerResultPageHelper.completeRegistration();
    }

    @Test
    public void addToCartAppleLaptop() {
        app.mainPageHelper.openComputersPage();
        app.computersHelper.openDesktopsPage();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
