package collections.lists;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aleksey on 28.06.2017.
 */
public class TestArrayList {
    public static void main(String[] args) {
      List<String> strings = new ArrayList();
      List<String> strings1 = new ArrayList();

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
