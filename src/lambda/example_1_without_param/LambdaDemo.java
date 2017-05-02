package lambda.example_1_without_param;

/**
 * Created by Aleksey on 02.05.2017.
 */
public class LambdaDemo {
    public static void main(String[] args) {
        MyNumder myNumder;
        myNumder =() -> 123.45;

        System.out.println(myNumder.getValue());

        myNumder =()-> Math.random()*100;
        System.out.println(myNumder.getValue());
        System.out.println(myNumder.getValue());
    }


}
