package collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Created by Aleksey on 28.06.2017.
 */
public class TestHashSet {
    public static void main(String[] args) {
        HashSet <String> strings = new HashSet<>();
        LinkedHashSet <String> strings1 = new LinkedHashSet<>();
        strings.add("Beta");
        strings.add("Alfa");
        strings.add("Eta");
        strings.add("Gamma");
        strings.add("Epsilon");
        strings.add("Omega");
        System.out.println(strings);

        strings1.add("Beta");
        strings1.add("Alfa");
        strings1.add("Eta");
        strings1.add("Gamma");
        strings1.add("Epsilon");
        strings1.add("Omega");
        System.out.println(strings1);
    }
}

