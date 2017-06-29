package generics.example_4_djeneric_restriction_extends;

/**
 * Created by Aleksey on 06.05.2017.
 */
public class Stats <T extends Number>  {
    T [] numbers;

    public Stats(T[] o) {
        numbers = o;
    }

    double average (){
        double sum = 0.0;

        for (int i = 0; i < numbers.length; i++) {
            sum +=numbers[i].doubleValue();
        }
        return sum / numbers.length;
    }
}
