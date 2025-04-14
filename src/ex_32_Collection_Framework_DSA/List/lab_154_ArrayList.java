package ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class lab_154_ArrayList {
    public static void main(String[] args) {

        List fruits = List.of("orange","Apple", "Banana");
        System.out.println(fruits);
       // fruits.add("Chiku"); // Notpossible

        List l = new ArrayList(); // Dynamic Dispatch

        l.add("hello");
        l.add("123");
        l.add(true);
        l.add("123");

        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.isEmpty());
        System.out.println(l.contains("1"));
        System.out.println(l.contains(1));
        System.out.println(l.indexOf("123"));
        System.out.println(l.lastIndexOf("123"));
        System.out.println(l);


        for(int i = 0; i < l.size() ; i++){
            System.out.println(l.get(i));
        }


    }
}
