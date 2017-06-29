package exceptions.chainExcDemo;

/**
 * Created by Aleksey on 26.06.2017.
 */
public class ChainExcDemo {
    static void demoproc(){
        NullPointerException e = new NullPointerException("Верхний уровень");

        e.initCause(new ArithmeticException("причина"));
    }

    public static void main(String[] args) {
        try{demoproc();}catch (NullPointerException e){
            System.out.println("Перехвачено исключение верхнего уровня " + e);

            System.out.println("Первопричина " + e.getCause());
        }
    }
}
