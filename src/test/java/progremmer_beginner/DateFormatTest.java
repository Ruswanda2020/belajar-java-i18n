package progremmer_beginner;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {
    @Test
    void testDateFormat() {
        var pattern="EEEE/dd/MMMM/YYYY";
        var dateFormat= new SimpleDateFormat(pattern);

        var format=dateFormat.format(new Date());

        System.out.println(format);
    }
    @Test
    void testDateFormatIndonesia() {
        var pattern="EEEE/dd/MMMM/YYYY";
        Locale indonesia=new Locale("in","ID");
        var dateFormat= new SimpleDateFormat(pattern,indonesia);

        var format=dateFormat.format(new Date());

        System.out.println(format);
    }

    @Test
    void testDateFormatJpan() {
        var pattern="EEEE/dd/MMMM/YYYY";
        var japan=new Locale("ja","JP");
        var dateFormat= new SimpleDateFormat(pattern,japan);

        var format=dateFormat.format(new Date());

        System.out.println(format);
    }

    @Test
    void testDateFormatParseIndonesia() {
        var pattern="EEEE dd MMMM YYYY";
        Locale indonesia=new Locale("in","ID");
        var dateFormat= new SimpleDateFormat(pattern,indonesia);

        try {
            var date =dateFormat.parse("Senin 27 Desember 2022");
            System.out.println(date);

        }catch (ParseException e){
            System.out.println("gagal "+e.getMessage());
        }
    }
}
