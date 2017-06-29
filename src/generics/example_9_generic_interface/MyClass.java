package generics.example_9_generic_interface;

/**
 * Created by Aleksey on 06.05.2017.
 */
public class MyClass <T extends Comparable<T>> implements MinMax<T> {
    T [] values;

    @Override
    public T min() {
        T v = values[0];
        for (int i = 1; i < values.length ; i++) {
            if (values[i].compareTo(v)<0)
                v = values[i];
        }
        return v;
    }

    @Override
    public T max() {
        T v = values[0];
        for (int i = 1; i <values.length ; i++) {
            if (values[i].compareTo(v)>0) v = values[i];
        }
        return v;
    }
}
