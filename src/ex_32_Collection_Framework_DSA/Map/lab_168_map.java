package ex_32_Collection_Framework_DSA.Map;

import java.util.*;


public class lab_168_map {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        m1.put("name","Deep");
        m1.put("Roll NO", 1);
        m1.put("Phone", 22141212);
        System.out.println(m1); // random order

        Map m2 = new LinkedHashMap();
        m2.put("name","Deep");
        m2.put("name","Bhalavat"); // Replace the original value as duplicate key not allowed
        m2.put("Roll NO", 1);
        m2.put("Phone", 22141212);
        System.out.println(m2);
        // Same order as we enter

        Map m3 = new TreeMap();
        m3.put("Firstname","Deep");
        m3.put("Lastname","Bhalavat");
        m3.put("Roll NO", 1);
        m3.put("Phone", 22141212);
        System.out.println(m3);
        // Natural Sorting



    }
}
