package ex_32_Collection_Framework_DSA.List;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class lab_156_Vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        Vector v1 = new Vector(10);

        v.add("Deep");
        v.add("Bhalavat");

        System.out.println("---- Iterator");

        Iterator iterator = v.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("---- ListIterator");
        ListIterator listIterator = v.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }




    }
}
