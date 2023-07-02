package progremmer_beginner;

import org.junit.jupiter.api.Test;

import java.text.ChoiceFormat;
import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class MassegeChoisFormatTest {
    @Test
    void testMessgeChoisFormat() {

        var pattern="-1#mines | 0#kosong | 1<banyak";
        var choisFormat=new ChoiceFormat(pattern);

        System.out.println(choisFormat.format(0));
        System.out.println(choisFormat.format(-1));
        System.out.println(choisFormat.format(2));
    }
    @Test
    void testMaseggeFormatTypeAmerica() {

        Locale america=new Locale("en","US");
        var resourceBundle = ResourceBundle.getBundle("massege",america);

        var pattren=resourceBundle.getString("balance");
        var massegeFormat=new MessageFormat(pattren,america);

        System.out.println(massegeFormat.format(new Object[]{0}));
        System.out.println(massegeFormat.format(new Object[]{-100000}));
        System.out.println(massegeFormat.format(new Object[]{1000000}));

    }
    @Test
    void testMaseggeFormatTypeindonesia() {

        Locale indonesia=new Locale("in","ID");
        var resourceBundle = ResourceBundle.getBundle("massege",indonesia);

        var pattren=resourceBundle.getString("balance");
        var massegeFormat=new MessageFormat(pattren,indonesia);

        System.out.println(massegeFormat.format(new Object[]{0}));
        System.out.println(massegeFormat.format(new Object[]{-100000}));
        System.out.println(massegeFormat.format(new Object[]{1000000}));

    }
}
