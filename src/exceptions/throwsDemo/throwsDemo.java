package exceptions.throwsDemo;

/**
 * Created by Aleksey on 26.06.2017.
 */
public class throwsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("В теле метода throwOne(). ");
        throw new IllegalAccessException("демонстрация ");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Перехвачено исключение " + e);
        }
    }
}
