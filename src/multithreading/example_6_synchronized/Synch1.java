package multithreading.example_6_synchronized;

/**
 * Created by Aleksey on 29.04.2017.
 */
public class Synch1 {
    public static void main(String[] args) {
        Callme callme = new Callme();
        Caller c1 = new Caller(callme, "Добро пожаловать");
        Caller c2 = new Caller(callme, "в синхронизированный");
        Caller c3 = new Caller(callme, "мир");

        try {
            c1.t.join();
            c2.t.join();
            c3.t.join();
        } catch (InterruptedException e) {
            System.out.println("прервано");
        }
    }
}
