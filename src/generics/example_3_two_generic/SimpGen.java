package generics.example_3_two_generic;

/**
 * Created by Aleksey on 06.05.2017.
 */
public class SimpGen {
    public static void main(String[] args) {
        TwoGen <Integer, String> tgObj = new TwoGen<>(88, "Generic");
        tgObj.showTypes();
        System.out.println(tgObj.getOb1());
        System.out.println(tgObj.getOb2());

        int i = tgObj.getOb1();
        System.out.println(i);

        String s = tgObj.getOb2();
        System.out.println(s);
    }
}
