package Ex_02_Java_Basics_part2;

public class lab021_printf {
    public static void main(String[] args) {
        int a = 10;
        System.out.printf("Your variable is %d",a);
        // %d -> int,Byte,Long, Short - Data Type
        // %s -> String
        // %f -> Float,double
        // %b -> Boolean
        int b = 20;
        System.out.println("---");
        System.out.printf("%d + %d", a,b);
//Output
//        Your variable is 10---
//               10 + 20
    }
}
