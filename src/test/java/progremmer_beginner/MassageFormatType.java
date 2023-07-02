package progremmer_beginner;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class MassageFormatType {
    @Test
    void testMaseggeFormatType() {

        Locale indonesia=new Locale("in","ID");
        var resourceBundle = ResourceBundle.getBundle("massege",indonesia);

        var pattren=resourceBundle.getString("status");
        var massegeFormat=new MessageFormat(pattren,indonesia);
        var format=massegeFormat.format(new Object[]{
            "wanda",new Date(),1000000
        });

        System.out.println(format);

    }
    @Test
    void testMaseggeFormatTypeAmerica() {

        Locale america=new Locale("en","US");
        var resourceBundle = ResourceBundle.getBundle("massege",america);

        var pattren=resourceBundle.getString("status");
        var massegeFormat=new MessageFormat(pattren,america);
        var format=massegeFormat.format(new Object[]{
                "wanda",new Date(),1000000
        });

        System.out.println(format);

    }
}
