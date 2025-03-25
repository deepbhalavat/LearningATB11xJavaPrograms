package Tasks;

import java.util.Scanner;

public class Task_07_Triangle_Classifier {
    public static void main(String[] args) {
        //✅ Triangle Classifier:
        //
        //Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides,
        // determine if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal), or scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease enter length of first side for triangle");
        int a = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("PLease enter length of second side for triangle");
        int b = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("PLease enter length of second side for triangle");
        int c = scanner2.nextInt();

        if( a <= 0 || b <= 0 || c <=0){
            System.out.println("This is not a triangle");
            System.exit(0);
        }
        if( a + b <= c || b + c <= a || a + c <= b){
            System.out.println("This is not a triangle");
            System.exit(0);
        }

        if(a == b && a == c){
                System.out.println("Triangle is equilateral (all sides are equal)");
        } else if (a == c || b == c || a == b) {
            System.out.println("Triangle is isosceles (exactly two sides are equal)");
        } else {
            System.out.println("Triangle is scalene (no sides are equal)");
        }
        scanner2.close();
        scanner1.close();
        scanner.close();

    }
}
