package lambda.example_7_lambda_as_param;

/**
 * Created by Aleksey on 04.05.2017.
 */
public class LambdaAsArgument {
    static String stringOp(StringFunction sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда выражение повышает эффективность языкаJava";
        String outStr;

        System.out.println("Исходная строка: " + inStr);

        outStr = stringOp((s) -> s.toUpperCase(), inStr);
        System.out.println("Строка в верхнем регистре " + outStr);

        outStr = stringOp((s) -> {
            String result = "";
            int i;
            for (i = 0; i < s.length(); i++)
                if (s.charAt(i) != ' ')
                    result += s.charAt(i);
            return result;
        }, inStr);
        System.out.println("Строка с удалением пробелов: " + outStr);

        StringFunction reverse = (s) -> {
            String result = "";
            int i;

            for (i = s.length() - 1; i >= 0; i--) {
                result += s.charAt(i);
            }
            return result;
        };
        System.out.println("Это обращенная строка: " + stringOp(reverse, inStr));
    }
}
