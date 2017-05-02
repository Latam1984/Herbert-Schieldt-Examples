package lambda.example_2_with_param;

/**
 * Created by Aleksey on 02.05.2017.
 */
public class lambdaDemo2 {
    public static void main(String[] args) {
        NumericTest isEven = (n) -> (n % 2) == 0;
        if (isEven.test(10)) System.out.println("Число 10 четное");
        if (!isEven.test(9)) System.out.println("Чимло 9 не четное");
        NumericTest isNotNeg = (n) -> n >= 0;
        if (isNotNeg.test(2)) System.out.println("Число два не отрицательное");
        if (!isNotNeg.test(-2)) System.out.println("Число - два отрицательное");
    }
}
