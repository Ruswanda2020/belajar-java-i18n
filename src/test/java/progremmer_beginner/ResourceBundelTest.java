package progremmer_beginner;

import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundelTest {
    @Test
    void resourceBundletTest() {

        var resourceBundle =ResourceBundle.getBundle("massege");
        System.out.println(resourceBundle.getString("hallo"));
        System.out.println(resourceBundle.getString("goodbye"));
    }
    @Test
    void testresourceBundletIndonesia() {

        Locale indonesia=new Locale("in","ID");
        var resourceBundle =ResourceBundle.getBundle("massege",indonesia);
        System.out.println(resourceBundle.getString("hallo"));
        System.out.println(resourceBundle .getString("goodbye"));
    }
    @Test
    void resourceBundleNotFound() {

        Locale indonesia=new Locale("en","US");
        var resourceBundle =ResourceBundle.getBundle("massege",indonesia);
        System.out.println(resourceBundle.getString("hallo"));
        System.out.println(resourceBundle.getString("goodbye"));
    }
    @Test
    void resourceBundleMultypleTimes() {

        Locale indonesia=new Locale("en","US");
        var resourceBundle1 =ResourceBundle.getBundle("massege",indonesia);
        var  resourceBundle2 =ResourceBundle.getBundle("massege",indonesia);

        System.out.println(resourceBundle1==resourceBundle2);

    }
}
