package multithreading.example_1_mainThread;

/**
 * Created by Aleksey on 29.04.2017.
 */
public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Текущий поток исполнения: " + t);
        t.setName("MyThread");

        System.out.println("Поток после изменения имени: " + t);


        for (int i = 5; i > 0; i--) {
            try {
                System.out.println(i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Главный поток исполнения прерван");
            }
        }
    }
}
