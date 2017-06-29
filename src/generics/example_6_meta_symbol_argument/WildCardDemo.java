package generics.example_6_meta_symbol_argument;

/**
 * Created by Aleksey on 06.05.2017.
 */
public class WildCardDemo {
    public static void main(String[] args) {
        Integer [] inums = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<>(inums);
        double v = iob.average();
        System.out.println(v);

        Double [] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats <Double> dob = new Stats<>(dnums);
        double w = dob.average();
        System.out.println(w);

        Float [] fnums = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
        Stats<Float> fod = new Stats<>(fnums);
        double x =fod.average();

        if (iob.sumAverage(dob))
            System.out.println("equals");
        else System.out.println("different");

        if (iob.sumAverage(fod)) System.out.println("equals");
        else System.out.println("different");
    }
}
