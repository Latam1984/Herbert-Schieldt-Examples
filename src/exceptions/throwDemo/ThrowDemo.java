package exceptions.throwDemo;

/**
 * Created by Aleksey on 26.06.2017.
 */
public class ThrowDemo {
    static void demoProc() {
        try {
            throw new NullPointerException("демонстрация ");
        } catch (NullPointerException e) {
            System.out.println("Исключение перехвачено в теле метода demoproc().");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoProc();
        } catch (NullPointerException e) {
            System.out.println("Повторный перехват: " + e);
        }
    }
}
