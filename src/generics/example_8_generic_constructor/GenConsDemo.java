package generics.example_8_generic_constructor;

/**
 * Created by Aleksey on 06.05.2017.
 */
public class GenConsDemo {
    public static void main(String[] args) {
        GenCons genCons = new GenCons(100);
        GenCons genCons2 = new GenCons(123.3F);

        genCons.showValue();
        genCons2.showValue();

    }
}
