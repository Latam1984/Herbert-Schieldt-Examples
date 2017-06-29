package generics.example_1_simple_generic;

/**
 * Created by Aleksey on 06.05.2017.
 */
public class genDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;

        iOb = new Gen<Integer>(88);
        iOb.showType();

        int v = iOb.getOb();
        System.out.println(v);

        Gen<String> strOb = new Gen<>("Example generic string");
        strOb.showType();
        String s = strOb.getOb();
        System.out.println(s);
    }
}
