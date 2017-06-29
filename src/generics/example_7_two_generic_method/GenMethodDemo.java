package generics.example_7_two_generic_method;

/**
 * Created by Aleksey on 06.05.2017.
 */
public class GenMethodDemo {
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x == y[i]) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Integer [] nums = {1, 2, 3, 4, 5};
        if (isIn(2, nums)) System.out.println("number 2 is contained in array");
        if (!isIn(7, nums)) System.out.println("number 7 is not contained in array");

        String [] str = {"one", "two", "three", "Four", "five"};
        if (isIn("three", str)) System.out.println("Three contains in array");
        if (isIn("four", str)) System.out.println("Four contains in array");
    }
}
