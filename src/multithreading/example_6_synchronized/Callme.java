package multithreading.example_6_synchronized;

/**
 * Created by Aleksey on 29.04.2017.
 */
public class Callme {
    void call (String msg){
        System.out.println("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Поток прерван.");
        }
        System.out.println("]");
    }
}
