package progremmer_beginner;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class MassegeFormatTest {
    @Test
    void testMassageFormat() {
        var pattern="hai {0} Anda bisa mencari data Anda dengan dengan mengetikin \"{0}\"di pencarian ";
        var massgeFormat=new MessageFormat(pattern);
        //massgeFormat.applyPattern(); untuk merubah pettren nya kalo mau !

        var format =massgeFormat.format(new Object[]{"wanda"});
        System.out.println(format);
    }

    @Test
    void testMassegeFormatResourceBundle() {
        var local=new Locale("en","US");
        var resourceBundle=ResourceBundle.getBundle("massege",local);

        var pettern=resourceBundle.getString("welcome.massege");

        var formatMasseg=new MessageFormat(pettern);
        var format=formatMasseg.format(new Object[]{"wanda","progremmer beginner"});

        System.out.println(format);
    }
}
