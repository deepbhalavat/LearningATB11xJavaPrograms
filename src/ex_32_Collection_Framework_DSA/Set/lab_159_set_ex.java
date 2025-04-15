package ex_32_Collection_Framework_DSA.Set;

import java.util.*;
import java.util.HashSet;

public class lab_159_set_ex {
    public static void main(String[] args) {
        Set<String> hs = new HashSet();
        // No order // No Duplicate

        hs.add("Apple");
        hs.add("Orange");
        hs.add("Watermelon");
        hs.add("Watermelon");
         // hs.add(123); > as we use string
        hs.add(null);
        hs.add(null);
        System.out.println("Has Set" + hs);

        Iterator iterator = hs.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("-------------------");




        Set lhs = new LinkedHashSet();
        // Order maintain and No duplicates
        lhs.add("Dpple");
        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("Watermelon");
        lhs.add("Watermelon");
        lhs.add("null");
        System.out.println("Linked Has Set" + lhs);
        System.out.println(lhs.contains("Apple"));

        System.out.println("-------------------");

        Set ts = new TreeSet();
        //Order will maintain
        // Natural sorting is done automatically
        // NUll not allowed
        ts.add("Dpple");
        ts.add("apple");
        ts.add("Apple");
        ts.add("Orange");
       // ts.add(123);
        ts.add("Watermelon");
        //ts.add(null);
        System.out.println("Tree Set" + ts);
        System.out.println("---- For Each ---- ");

        for (Object o:ts){
            System.out.println(o);
        }



    }
}
