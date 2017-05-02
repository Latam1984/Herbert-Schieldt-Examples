package lambda.example_5_block_lambda_reverse_string;

/**
 * Created by Aleksey on 02.05.2017.
 */
public class BlockLambdaDemo {
    public static void main(String[] args) {
        StringFunction reverse = (s) -> {
            String result = "";
            int i;
            for (i = s.length() - 1; i >= 0; i--) {
                result += s.charAt(i);
            }
            return result;
        };
        System.out.println(reverse.func("яблоко"));
    }
}
