package Functional;

import Application.ApplicationManager;
import Factories.UserFactory;
import Models.User;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public abstract class BaseTest {
    ApplicationManager app;
    User testValidUser;
    User testWOFNameUser;
    User testWOLNameUser;
    User testWOEmailUser;

    @BeforeSuite
    public void testSuiteInitialization() throws Exception {
        app = new ApplicationManager();
        testValidUser = UserFactory.generateValidUser();
        testWOFNameUser = UserFactory.generateNonValidUserWOFName(testValidUser);
        testWOLNameUser = UserFactory.generateNonValidUserWOLName(testValidUser);
        testWOEmailUser = UserFactory.generateNonValidUserWOEmail(testValidUser);
    }


    @AfterSuite
    public void testSuiteComplete() throws Exception {
        app.stop();
    }
}
