package multithreading.example_5_multithreading_join_isAlive;

/**
 * Created by Aleksey on 29.04.2017.
 */
public class Join {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("Один");
        NewThread ob2 = new NewThread("Один");
        NewThread ob3 = new NewThread("Один");

        System.out.println("Поток 1 запущен " + ob1.t.isAlive());
        System.out.println("Поток 2 запущен " + ob2.t.isAlive());
        System.out.println("Поток 3 запущен " + ob3.t.isAlive());


        System.out.println("Ожидание завершения потоков");
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Поток 1 запущен " + ob1.t.isAlive() );
        System.out.println("Поток 2 запущен " + ob2.t.isAlive() );
        System.out.println("Поток 3 запущен " + ob3.t.isAlive() );

        System.out.println("Главный поток завершен");
    }

}
