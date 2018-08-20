package Functional;

import Models.Product;
import org.testng.annotations.BeforeSuite;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class AddToCartTests extends BaseTest {

    String actualTotalPrice = "";
    List<Product> products = new ArrayList<>();
    NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
    ArrayList<Double> expectedTotalPrice = new ArrayList<>();


    @BeforeSuite
    public void registration() {
        app.start();
        app.navigationHelper.openRegistrationPage();
        app.registrationHelper.registrateUser(testValidUser);
        app.registrationHelper.completeRegistration();
    }

    public String getExpectedTotalPrice(ArrayList<Double> totalPrice) {
        double sum = 0;
        for (double price : totalPrice
        )
            sum += price;
        return format.format(sum);
    }
}
