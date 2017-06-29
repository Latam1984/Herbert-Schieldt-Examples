package generics.example_1_simple_generic;

/**
 * Created by Aleksey on 06.05.2017.
 */
public class Gen <T> {
   T ob;

    public Gen(T o) {
        ob = o;
    }

    T getOb (){
        return ob;
    }
    void showType(){
        System.out.println(ob.getClass().getName());
    }
}
