package Helpers;

import org.javamoney.moneta.Money;

import javax.money.MonetaryAmount;
import javax.money.NumberValue;
import javax.money.format.MonetaryAmountFormat;
import javax.money.format.MonetaryFormats;
import java.util.Locale;

public class MoneyHelper {

    public double fromStringToDouble(String string){
        string = string.substring(1);
        MonetaryAmountFormat usFormat = MonetaryFormats.getAmountFormat(Locale.CANADA);
        MonetaryAmount amount = usFormat.parse("USD " + string);
        NumberValue money = amount.getNumber();
        double value = money.doubleValue();
        return value;
    }

    public String fromDoubleToString(double price) {
        MonetaryAmountFormat usFormat = MonetaryFormats.getAmountFormat(Locale.CANADA);
        MonetaryAmount amount = Money.of(price, "USD");
        String result = "$" + usFormat.format(amount).substring(3);
        return result;
    }
}
