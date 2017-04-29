package multithreading.example_2_newThread_Runnable;

/**
 * Created by Aleksey on 29.04.2017.
 */
public class NewThread implements Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this, "Демонстрационный поток");
        System.out.println("Дочерний поток создан " + t);
        t.start();
    }

    @Override
    public void run() {
        for (int i = 5; i > 0; i--) {
            try {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Дочерний поток прерван.");
            }
        }
        System.out.println("Дочерний поток завершен.");
    }
}
