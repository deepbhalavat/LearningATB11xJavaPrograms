package ex_32_Collection_Framework_DSA.List;

import java.util.Stack;

public class lab_158_stack {
    public static void main(String[] args) {

        // Last In > First out(LIFO)
        Stack s = new Stack();
        s.add("Deep");
        s.push("Bhalavat");
        s.push("Pankajbhai");
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.peek()); // display last element
        System.out.println(s);
        System.out.println(s.pop()); // remove last element
        System.out.println(s);


    }
}
