package stack;

/**
 * Created by Aleksey on 08.05.2017.
 */
public class TestStack {
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();

        for (int i = 0; i < 10; i++) {
            stack1.push(i);
        }
        for (int j = 10; j < 20; j++) {
            stack2.push(j);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(stack1.pop());
        }
        for (int i = 10; i < 20; i++) {
            System.out.println(stack2.pop());
        }

    }
}
