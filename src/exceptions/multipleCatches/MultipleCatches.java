package exceptions.multipleCatches;

/**
 * Created by Aleksey on 26.06.2017.
 */
public class MultipleCatches {
    public static void main(String[] args) {
        try{
            int a = args.length;
            System.out.println("IteratorDemo = " +a);
            int b = 42/a;
            int c [] = {1};
            c [42] = 99;
        } catch (ArithmeticException e){
            System.out.println("деление на ноль " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка индексации за пределами массива " + e);
        }
        System.out.println("После блока операторов try/catch");
    }
}
