package ex_32_Collection_Framework_DSA.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class lab_167_arrayDeque {
    public static void main(String[] args) {
        Deque<Integer> deck = new ArrayDeque<>();
        deck.push(15);
        deck.push(11);
        System.out.println(deck);
    }
}
