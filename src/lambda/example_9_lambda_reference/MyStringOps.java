package lambda.example_9_lambda_reference;

/**
 * Created by Aleksey on 04.05.2017.
 */
public class MyStringOps {
    static String reversString(String s) {
        String result = "";
        int i;

        for (i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }
}
