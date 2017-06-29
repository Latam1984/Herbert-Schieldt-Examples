package collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by Aleksey on 28.06.2017.
 */
public class TestArrayDeque {
    public static void main(String[] args) {
        Queue<String> strings = new ArrayDeque<>();

        strings.add("A");
        strings.add("B");
        strings.add("D");
        strings.add("E");
        strings.add("F");
        strings.add("C");

        System.out.println("Eject from stack");
        while (strings.peek() != null)
            System.out.println(strings.poll());

        System.out.println(strings);
    }
}
