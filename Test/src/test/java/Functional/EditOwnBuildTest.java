package Functional;

import org.testng.Assert;
import org.testng.annotations.*;


public class EditOwnBuildTest extends AddToCartTests {

    private String actualItemPrice;
    private final double ACROBAT_PRICE = 10;
    private final double TOTAL_COMMANDER_PRICE = 5;
    private final double VISTA_PREMIUM_PRICE = 60;
    private final double VISTA_HOME_PRICE = 50;
    private double DEFAULT_BUILD_PRICE = 1200;
    private double HDD_400_PRICE = 100;
    private double MS_OFFICE_PRICE = 50;
    private double INTEL_PENTIUM_25_GHZ = 15;
    private double expectedDefaultPrice;


    @BeforeClass
    public void addTwoCartProduct() {
        app.navigationHelper.openMainPageViaUrl();
        app.navigationHelper.openComputerPage();
        app.navigationHelper.openDesktopPage();
        app.productHelper.selectOwnBuild();
        actualItemPrice = app.productHelper.getPriceString();
    }

    @Test
    public void defaultPriceShouldBeCorrect() {
        expectedDefaultPrice = DEFAULT_BUILD_PRICE + MS_OFFICE_PRICE + VISTA_HOME_PRICE + INTEL_PENTIUM_25_GHZ;
        Assert.assertEquals( actualItemPrice, app.moneyHelper.fromDoubleToString(expectedDefaultPrice));
    }

    @Test
    public void addAcrobatReader() {
        String oldPrice = app.productHelper.getPriceString();
        app.productHelper.addAcrobatReaderToOwnBuild();
        app.productHelper.waitWhenPriceChanged(oldPrice);
        actualItemPrice = app.productHelper.getPriceString();
        expectedDefaultPrice = DEFAULT_BUILD_PRICE + MS_OFFICE_PRICE + VISTA_HOME_PRICE + INTEL_PENTIUM_25_GHZ + ACROBAT_PRICE;
        Assert.assertEquals( actualItemPrice, app.moneyHelper.fromDoubleToString(expectedDefaultPrice));
    }

    @Test
    public void changeOS() {
        String oldPrice = app.productHelper.getPriceString();
        app.productHelper.selectVistaPremium();
        app.productHelper.waitWhenPriceChanged(oldPrice);
        actualItemPrice = app.productHelper.getPriceString();
        expectedDefaultPrice = DEFAULT_BUILD_PRICE + MS_OFFICE_PRICE + VISTA_PREMIUM_PRICE + INTEL_PENTIUM_25_GHZ;
        Assert.assertEquals( actualItemPrice, app.moneyHelper.fromDoubleToString(expectedDefaultPrice));
    }


}
