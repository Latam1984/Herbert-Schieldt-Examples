package generics.example_9_generic_interface;

/**
 * Created by Aleksey on 06.05.2017.
 */
public interface MinMax <T extends Comparable<T>>{
    T min();
    T max();
}
