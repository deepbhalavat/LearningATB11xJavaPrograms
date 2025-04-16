package ex_32_Collection_Framework_DSA.Queue;

import java.util.PriorityQueue;

public class lab_165_queue {
    public static void main(String[] args) {

        PriorityQueue q = new PriorityQueue();
        q.add("Deep");
        q.add("Bhalavat");
        System.out.println(q);
        // Natural sorting
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
    }
}
