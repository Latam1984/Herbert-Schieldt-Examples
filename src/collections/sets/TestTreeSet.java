package collections.sets;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Aleksey on 28.06.2017.
 */
public class TestTreeSet {
    public static void main(String[] args) {
        Set<String> strings = new TreeSet<>();
        strings.add("C");
        strings.add("A");
        strings.add("B");
        strings.add("E");
        strings.add("F");
        strings.add("D");
        System.out.println(strings);

    }
}
