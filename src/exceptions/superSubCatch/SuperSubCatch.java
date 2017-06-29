package exceptions.superSubCatch;

/**
 * Created by Aleksey on 26.06.2017.
 */
public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
        } catch (Exception e) {
            System.out.println("Перехват исключения общего класса Exception");
        }
//        catch (ArithmeticException e) {
//            System.out.println("Этот код вообще не достижим");
//        }
    }
}
