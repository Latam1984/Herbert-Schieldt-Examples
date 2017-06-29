package generics.example_4_djeneric_restriction_extends;

/**
 * Created by Aleksey on 06.05.2017.
 */
public class BoundsDemo {
    public static void main(String[] args) {
        Integer [] numbers = {1, 2, 3, 4, 5};
        Stats<Integer>  iob = new Stats<>(numbers);
        double v = iob.average();
        System.out.println(v);

        Double [] dums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats <Double> doubleStats = new Stats<>(dums);
        double d = doubleStats.average();
        System.out.println(d);

    }
}
