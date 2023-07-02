package progremmer_beginner;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {
    @Test
    void numberFormatTest() {
        var numberFormat = NumberFormat.getNumberInstance();
        var format=numberFormat.format(10000000.255);
        System.out.println(format);
    }
    @Test
    void numberFormatTestIndonesia() {
        Locale indonesia=new Locale("id","ID");
        var numberFormat = NumberFormat.getNumberInstance(indonesia);
        var format=numberFormat.format(10000000.255);
        System.out.println(format);
    }
    @Test
    void testNumberFormatParseIndonesia() {
        Locale indonesia=new Locale("in","ID");
        var numberFormat = NumberFormat.getNumberInstance(indonesia);

        try {
            var result=numberFormat.parse("1.000.000,265").doubleValue();
            System.out.println(result);

        }catch (ParseException e){
            System.out.println("eror parse : "+e.getMessage());
        }
    }

}
