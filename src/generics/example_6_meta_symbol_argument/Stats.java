package generics.example_6_meta_symbol_argument;

/**
 * Created by Aleksey on 06.05.2017.
 */
public class Stats<T extends Number> {
    T[] numbers;

    public Stats(T[] n) {
        numbers = n;
    }

    double average() {
        double sum = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i].doubleValue();
        }
        return sum / numbers.length;
    }

    boolean sumAverage(Stats<?> ob){
        if (average() == ob.average())
            return true;
        else return false;
    }
}
