package Tests;

import Application.App;
import Factories.UserFactory;
import Models.User;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    App app;
    User testValidUser;

    @BeforeSuite
    public void testSuiteInitialization() throws Exception{
        app = new App();
        testValidUser = UserFactory.generateValidUser();
    }


    @AfterSuite
    public void testSuiteComplete() throws Exception{
        app.commonHelper.closeWebBrowser();
    }
}
