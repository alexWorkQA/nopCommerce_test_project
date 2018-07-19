package Tests;

import Application.App;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    App app;

    @BeforeSuite
    public void testSuiteInitialization() throws Exception{
        app = new App();
    }


    @AfterSuite
    public void testSuiteComplete() throws Exception{
        app.commonHelper.closeWebBrowser();
    }
}
