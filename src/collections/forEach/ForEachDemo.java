package collections.forEach;

import java.util.ArrayList;

/**
 * Created by Aleksey on 28.06.2017.
 */
public class ForEachDemo {
    public static void main(String[] args) {
        ArrayList<Integer> vals = new ArrayList<>();
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);
        vals.add(6);

        System.out.println("First view of list ");
        for (Integer val : vals) {
            System.out.println(val);
        }
        Integer sum = 0;
        for (Integer val : vals) {
            sum += val;
        }
        System.out.println("sum = " + sum );
    }

}
