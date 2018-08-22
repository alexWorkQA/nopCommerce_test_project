package Functional;

import org.testng.Assert;
import org.testng.annotations.*;


public class EditOwnBuildTest extends AddToCartTests {

    private String itemPrice;
    private final double ACROBAT_PRICE = 10;
    private final double TOTAL_COMMANDER_PRICE = 5;
    private final double VISTA_PREMIUM_PRICE = 60;
    private final double VISTA_HOME_PRICE = 50;
    private double DEFAULT_BUILD_PRICE = 1200;
    private double HDD_400_PRICE = 100;
    private double MS_OFFICE_PRICE = 50;
    private double intelPentium25GHz = 15;
    private double actualDefaultPrice;



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
        actualDefaultPrice = DEFAULT_BUILD_PRICE+MS_OFFICE_PRICE+VISTA_HOME_PRICE+intelPentium25GHz;
        Assert.assertEquals(app.moneyHelper.fromDoubleToString(actualDefaultPrice),itemPrice);
    }

    @Test
    public void addAcrobatReader() {
        String oldPrice = app.productHelper.getPriceString();
        app.productHelper.addAcrobatReaderToOwnBuild();
        app.productHelper.waitWhenPriceChanged(oldPrice);
        itemPrice = app.productHelper.getPriceString();
        actualDefaultPrice = DEFAULT_BUILD_PRICE+MS_OFFICE_PRICE+VISTA_HOME_PRICE+intelPentium25GHz + ACROBAT_PRICE;
        Assert.assertEquals(app.moneyHelper.fromDoubleToString(actualDefaultPrice), itemPrice);
    }




}
