package Ex_04_Type_Casting;

import java.util.concurrent.CountDownLatch;

public class Lab035_Type_Cast_Real_Example {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
        // int total = course + GST; // Narrow - Implicit
        int total1 = course + (int) GST; // Narrow - Explicit
        System.out.println(total1);

        float total2 = course + GST; // Widening - auto - Implicit
        float total3 = (float) course + GST; // Widening - auto - Explicit
        System.out.println(total2);
    }
}
