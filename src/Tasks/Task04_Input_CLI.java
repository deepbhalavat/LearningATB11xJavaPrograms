package Tasks;

import java.util.Scanner;

public class Task04_Input_CLI {
    public static void main(String[] args) {
        // Take a user input - Name, Age and Salary and print them in the end.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Name");
        String name = scanner.next();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please enter your salary in LPA format");
        double salary = scanner2.nextDouble();

        System.out.println("User name is " + name + " and age is " + age + " and salary is " + salary + "LPA");
    }
}
