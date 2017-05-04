package lambda.example_8_lambda_exception;

/**
 * Created by Aleksey on 04.05.2017.
 */
public class EmptyArrayException extends Exception {
    EmptyArrayException (){
        System.out.println("Массив пуст!");
    }
}
