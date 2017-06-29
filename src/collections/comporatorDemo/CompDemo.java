package collections.comporatorDemo;

import java.util.TreeSet;

/**
 * Created by Aleksey on 29.06.2017.
 */
public class CompDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>(new MyComp());
        ts.add("E");
        ts.add("D");
        ts.add("F");
        ts.add("A");
        ts.add("C");
        ts.add("B");

        System.out.println(ts);
        //=============================================reverse

        MyComp myComp = new MyComp();
        TreeSet<String> ts1 = new TreeSet<>(myComp.reversed());
        ts1.add("E");
        ts1.add("D");
        ts1.add("F");
        ts1.add("A");
        ts1.add("C");
        ts1.add("B");
        System.out.println(ts1);
        //============================================lambda
        TreeSet<String> ts2 = new TreeSet<>(
                (aStr, bStr) -> aStr.compareTo(bStr));
        ts2.add("E");
        ts2.add("D");
        ts2.add("F");
        ts2.add("A");
        ts2.add("C");
        ts2.add("B");
        System.out.println(ts2);
    }
}
