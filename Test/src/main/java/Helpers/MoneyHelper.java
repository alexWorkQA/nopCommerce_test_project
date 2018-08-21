package Helpers;

import java.text.ParseException;

public class MoneyHelper {

    public double fromStringToDouble(String string) throws ParseException {
        String [] prices = string.split("\\.");
        prices[0] = prices[0].substring(1);
        prices[0]=prices[0].replace(',','.');
        double result = Double.parseDouble(prices[0]);
        return result;
    }
}
