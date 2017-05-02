package lambda.example_4_block_lambda_factorial;

/**
 * Created by Aleksey on 02.05.2017.
 */
public class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFunction numericFunction = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            return result;
        };
        System.out.println(numericFunction.funct(5));
        System.out.println(numericFunction.funct(3));
    }
}
