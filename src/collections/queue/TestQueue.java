package collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by Aleksey on 28.06.2017.
 */
public class TestQueue {
    public static void main(String[] args) {
        Queue <String> strings = new PriorityQueue<>();
        strings.add("B");
        strings.add("A");
        strings.add("D");
        strings.add("F");
        strings.add("C");
        strings.add("E");
        System.out.println(strings);
    }
}
