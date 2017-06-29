package generics.example_8_generic_constructor;

/**
 * Created by Aleksey on 06.05.2017.
 */
public class GenCons {
    private double val;

    <T extends Number> GenCons(T arg){
        val = arg.doubleValue();
    }
    void showValue(){
        System.out.println(val);
    }
}
