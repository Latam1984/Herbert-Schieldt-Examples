package multithreading.example_3_newThread_Thread;

/**
 * Created by Aleksey on 29.04.2017.
 */
public class NewThread extends Thread {
    NewThread() {
        super("Демонстрационный поток");
        System.out.println("Дочерний поток " + this);
        start();
    }

    @Override
    public void run() {
        for (int i = 5; i > 0; i--) {
            try {
                System.out.println("Дочерний поток " + i);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Дочерний поток прерван");
            }
        }
        System.out.println("Дочерний поток завершен.");
    }
}
