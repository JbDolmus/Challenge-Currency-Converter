import java.math.BigDecimal;
import java.math.RoundingMode;

public class Logic {

    public double converterCurrency(Currency currency,String currencyInit, String currencyFinal, double amount){

        double result = currencyFinal.equals("USD") ? amount / currency.rates().get(currencyInit) :
                currency.rates().get(currencyFinal) * amount;
        return new BigDecimal(result)
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue();
    }
}
