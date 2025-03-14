package ex_08_If_condition;

import java.util.Scanner;

public class lab069_if_p1 {
    public static void main(String[] args) {
        // How to take user input
        // 1.CLI options
        int age = Integer.parseInt(args[0]);
        // 2.Scanner Class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age1 = scanner.nextInt();
        System.out.println(age1);

        if (age1 > 18){
            System.out.println("You can go to Goa");

        }
        else {
            System.out.println("You Can't go to Goa");

        }
    }
}
