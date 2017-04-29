package multithreading.example_5_multithreading_join_isAlive;

/**
 * Created by Aleksey on 29.04.2017.
 */
public class NewThread implements Runnable {
    public String name;
    Thread t;


    public NewThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println(name + t);
        t.start();
    }

    @Override
    public void run() {
        for (int i = 5; i > 0; i--) {
            try {
                System.out.println(t + " " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(t + " прерван");
            }
        }
        System.out.println(t + " завершен");
    }
}
