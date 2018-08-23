package Functional;

import Models.Product;
import org.testng.annotations.BeforeSuite;

import java.util.ArrayList;
import java.util.List;


public class AddToCartTests extends BaseTest {

    String actualTotalPrice = "";
    List<Product> products = new ArrayList<>();
    ArrayList<Double> expectedTotalPrice = new ArrayList<>();
    static final double OWN_BUILD_DEFAULT_PRICE = 1250.00;


    @BeforeSuite
    public void registration() {
        app.start();
        app.navigationHelper.openRegistrationPageViaUrl();
        app.registrationHelper.registrateUser(testValidUser);
        app.registrationHelper.completeRegistration();
    }

    String getExpectedTotalPrice(ArrayList<Double> totalPrice) {
        double sum = 0;
        for (double price : totalPrice
        )
            sum += price;
        return app.moneyHelper.fromDoubleToString(sum);
    }
}
