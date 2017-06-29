package generics.example_2_non_generic_but_object;

/**
 * Created by Aleksey on 06.05.2017.
 */
public class NonGenDemo {
    public static void main(String[] args) {
        NonGen nonGenDemo;

        nonGenDemo = new NonGen(88);
        nonGenDemo.showType();
        System.out.println(nonGenDemo.getOb());
        int v = (int) nonGenDemo.getOb();
        System.out.println(v);

        NonGen nonGenStr = new NonGen("Some string");
        nonGenStr.showType();
        System.out.println(nonGenDemo.getOb());
        String s = (String) nonGenStr.getOb();
        System.out.println(s);

        nonGenDemo = nonGenStr;
        System.out.println("!!!" + nonGenDemo.getOb());

        //runtime error
        //v = (Integer)nonGenDemo.getOb();



    }
}
