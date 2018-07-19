package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void loginTest(){
        String expected ="Hello world";
        Assert.assertEquals(expected,"Hello word");


    }
}
