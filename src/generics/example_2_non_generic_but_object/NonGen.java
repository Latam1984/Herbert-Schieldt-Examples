package generics.example_2_non_generic_but_object;

/**
 * Created by Aleksey on 06.05.2017.
 */
public class NonGen {
    Object ob;

    public NonGen(Object o) {
        ob = o;
    }

    Object getOb (){
        return ob;
    }

    void showType (){
        System.out.println(ob.getClass().getName());
    }
}
