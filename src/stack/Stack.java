package stack;

/**
 * Created by Aleksey on 08.05.2017.
 */
public class Stack {
    int stack [] = new int[10];
    int top ;

    Stack() {
         top=-1;
    }

    void push (int i){
        if (top ==9) System.out.println("Stack is full!");
        else
            stack[++top]=i;
    }

    int pop (){
        if (top==-1) System.out.println("Stack is empty");
         return stack[top--];
    }
}
