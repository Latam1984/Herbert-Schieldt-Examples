package multithreading.example_4_multithreading;

/**
 * Created by Aleksey on 29.04.2017.
 */
public class MultithreadingDemo {
    public static void main(String[] args) {
        new NewThread ("Один");
        new NewThread ("Два");
        new NewThread ("Три");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен");
    }
}
