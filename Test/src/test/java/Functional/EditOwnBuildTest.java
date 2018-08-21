package Functional;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EditOwnBuildTest extends AddToCartTests {

    private String expectedItemPrice = "$1,315.00";
    private String itemPrice;


    @BeforeClass
    public void addTwoCartProduct() {
        app.navigationHelper.openMainPageViaUrl();
        app.navigationHelper.openComputerPage();
        app.navigationHelper.openDesktopPage();
        app.productHelper.selectOwnBuild();
        itemPrice = app.productHelper.getPriceString();
    }

    @Test
    public void defaultPriceShouldBeCorrect() {
        Assert.assertEquals(expectedItemPrice, itemPrice);
    }

    @Test
    public void addAcrobatReader() throws InterruptedException {
        Thread.sleep(2000);
        app.productHelper.addAcrobatReaderToOwnBuild();
        Thread.sleep(2000);
        itemPrice = app.productHelper.getPriceString();
        Assert.assertEquals(expectedItemPrice,itemPrice);
    }

    /*@Test
    public void priceShouldBeCorrect(){
        String expectedPriceByDefault = "$1.200";
        Assert.assertEquals(expectedPriceByDefault,actualTotalPrice);
    }*/

}
