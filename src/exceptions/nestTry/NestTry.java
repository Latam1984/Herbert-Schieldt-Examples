package exceptions.nestTry;

/**
 * Created by Aleksey on 26.06.2017.
 */
public class NestTry {
    public static void main(String[] args) {
   try {
       int a = args.length;
       int b = 42 / a;
       System.out.println(" IteratorDemo = " + a);

       try {
           if (a == 1) a= a/(a-a);
           if(a == 2) {
               int c [] = {1};
               c [42] = 99;
           }
       }catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("Индекс за пределами массива " + e);
       }
   }catch (ArithmeticException e) {
       System.out.println("Деление на ноль " + e);
   }
    }
}
