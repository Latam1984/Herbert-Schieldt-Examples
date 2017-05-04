package lambda.example_9_lambda_reference;

/**
 * Created by Aleksey on 04.05.2017.
 */
public class MethodReferenceDemo {
    static String stringOp (StringFunc sf, String s){
        return sf.func(s);
    }


    public static void main(String[] args) {
        String inputString = "Лямбды повышают эффективность Java";
        String outputString = "";
        outputString = stringOp(MyStringOps::reversString, inputString);

        System.out.println(inputString);
        System.out.println(outputString);
    }

}
