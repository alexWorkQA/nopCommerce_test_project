package UnitTests;

import Application.ApplicationManager;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.ParseException;

public class MoneyHelperTest {
    String testData = "$1,315.00";

    @Test
    public void fromStringToDoubleTest() throws ParseException {
        ApplicationManager app = new ApplicationManager();
        double actualResult = app.moneyHelper.fromStringToDouble(testData);
        double expectedResult = 1.315;
        Assert.assertEquals(expectedResult,actualResult);
    }
}
