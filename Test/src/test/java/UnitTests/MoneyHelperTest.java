package UnitTests;

import Application.ApplicationManager;
import org.testng.annotations.*;

import static org.testng.Assert.*;


public class MoneyHelperTest {
    private ApplicationManager app;

    @DataProvider
    public Object[][] testDataParse() {
        return new Object[][]{
                new Object[]{"$1,315.00", 1315.00},
                new Object[]{"$1,500.50", 1500.50},
                new Object[]{"$500.50", 500.50},
                new Object[]{"$250.55", 250.55},
                new Object[]{"$12.50", 12.50},
                new Object[]{"$1.00", 1.00}};
    }


    @BeforeClass
    public void initialization() {
        app = new ApplicationManager();
    }

    @Test(dataProvider = "testDataParse")
    public void fromStringToDoubleTest(String testDataString, double testDataDouble) {
        double actualResult = app.moneyHelper.fromStringToDouble(testDataString);
        assertEquals(actualResult, testDataDouble);
    }

    @Test(dataProvider = "testDataParse")
    public void fromDoubleToStringTest(String testDataString, double testDataDouble) {
        String actualResult = app.moneyHelper.fromDoubleToString(testDataDouble);
        assertEquals(actualResult, testDataString);
    }
}
