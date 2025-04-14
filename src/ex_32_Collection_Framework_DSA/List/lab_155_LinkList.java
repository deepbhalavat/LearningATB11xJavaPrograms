package ex_32_Collection_Framework_DSA.List;

import java.util.LinkedList;
import java.util.List;

public class lab_155_LinkList {
    public static void main(String[] args) {

        List list = new LinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        LinkedList<String> animal = new LinkedList();
        animal.add("Dog");
        animal.add("Cat");
        animal.addFirst("Elephant");
        animal.addLast("Lion");
        System.out.println(animal);


    }
}
