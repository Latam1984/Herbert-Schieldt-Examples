package collections.iteratorDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by Aleksey on 28.06.2017.
 */
public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("C");
        a1.add("D");
        a1.add("B");
        a1.add("E");
        a1.add("A");
        a1.add("F");

        System.out.println(a1);

        Iterator<String> stringIterator = a1.iterator();
        while (stringIterator.hasNext()) {
            String element = stringIterator.next();
            System.out.println(element);
        }
        System.out.println();

        ListIterator<String> liter = a1.listIterator();
        while (liter.hasNext()) {
            String element = liter.next();
            liter.set(element);
        }
        System.out.println("Change collection ");
        stringIterator = a1.iterator();
        while (stringIterator.hasNext()) {
            String element = stringIterator.next();
            System.out.println(element);
        }
        System.out.println();

        System.out.println("Reverse change ");

        while (liter.hasPrevious()) {
            String element = liter.next();
            System.out.println(element);
        }
        System.out.println();
    }
}

