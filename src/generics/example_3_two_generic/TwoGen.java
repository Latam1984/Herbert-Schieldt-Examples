package generics.example_3_two_generic;

/**
 * Created by Aleksey on 06.05.2017.
 */
public class TwoGen<T, V> {
    T ob1;
    V ob2;

    public TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    void showTypes() {
        System.out.println(ob1.getClass().getName());
        System.out.println(ob2.getClass().getName());
    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }
}
