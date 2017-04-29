package multithreading.example_4_multithreading;

/**
 * Created by Aleksey on 29.04.2017.
 */
public class NewThread implements Runnable {
    String name;
    Thread t;

    NewThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("Новый поток " + t);
        t.start();
    }

    @Override
    public void run() {

        for (int i = 5; i > 0; i--) {
            try {
                System.out.println(name + " " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(name + " прерван.");
            }
        }
        System.out.println(name + " завершен.");
    }
}
