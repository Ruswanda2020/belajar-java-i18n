package progremmer_beginner;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class CurrnecyTest {
    @Test
    void testCurrencyIndonesia() {
        Locale indonesia=new Locale("in","ID");
        Currency currency=Currency.getInstance(indonesia);

        System.out.println(currency.getDisplayName());
        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getSymbol(indonesia));
    }
    @Test
    void testCurrencyUse() {
        Locale america=new Locale("en","US");
        Currency currency=Currency.getInstance(america);

        System.out.println(currency.getDisplayName());
        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getSymbol(america));
    }

    @Test
    void testCurrencyFormatIndonesia() {
        var indonsia=new Locale("in","ID");
        var namburFormat= NumberFormat.getCurrencyInstance(indonsia);

        var format=namburFormat.format(1000000);
        System.out.println(format);
    }
    @Test
    void testFormatCurrencyParseIndonesia() {
        var indonsia=new Locale("in","ID");
        var namburFormat= NumberFormat.getCurrencyInstance(indonsia);

        try {
            var parse=namburFormat.parse("Rp9.000.000").doubleValue();
            System.out.println(parse);
        }catch (ParseException e){
            System.out.println("eror parse : "+e.getMessage());
        }
    }
}
