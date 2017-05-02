package lambda.example_3_with_two_param;

/**
 * Created by Aleksey on 02.05.2017.
 */
public class LambdaDemo3 {
    public static void main(String[] args) {
        NumericTest2 numericTest2 = (n, d) -> n % d == 0;
        if (numericTest2.test(10, 2)) System.out.println("Число два является множителем числа десять");
        if (!numericTest2.test(10, 3)) System.out.println("Число три не является множителем числа десять");
    }
}
