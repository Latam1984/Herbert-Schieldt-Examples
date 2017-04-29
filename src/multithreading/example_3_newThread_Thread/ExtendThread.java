package multithreading.example_3_newThread_Thread;

/**
 * Created by Aleksey on 29.04.2017.
 */
public class ExtendThread {
    public static void main(String[] args) {
        new NewThread();

        for (int i = 5; i > 0; i--) {
            try {
            System.out.println("Главный поток " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Главный поток прерван ");
            }
        }
        System.out.println("Главный поток завершен");
    }
}
