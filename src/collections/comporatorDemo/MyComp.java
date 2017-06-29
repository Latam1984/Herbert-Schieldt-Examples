package collections.comporatorDemo;

import java.util.Comparator;

/**
 * Created by Aleksey on 29.06.2017.
 */
public class MyComp implements Comparator<String> {
    public int compare(String a, String b) {
        String aStr, bStr;
        aStr = a;
        bStr = b;
        return aStr.compareTo(bStr);
    }
}
