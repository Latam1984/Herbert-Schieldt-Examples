package lambda.example_6;

/**
 * Created by Aleksey on 02.05.2017.
 */
public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        SomeFunction<String> revers = (s) -> {
            String result = "";
            int i;
            for (i = s.length() - 1; i >= 0; i--) {
                result += s.charAt(i);
            }
            return result;
        };
        System.out.println(revers.function("няха"));

        SomeFunction<Integer> func = (s) -> {
            int result = 1;

            for (int i = 1; i <= s; i++) {
                result = result * i;
            }
            return result;
        };
        System.out.println(func.function(5));
    }
}
