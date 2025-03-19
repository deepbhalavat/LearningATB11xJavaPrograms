package ex_09_Switch;

import java.util.Scanner;

public class lab071_switch_without_break {
    public static void main(String[] args) {
        //Switch

        //Take a user input and tell them the day which they have told.
        // 1 to 7 >> 1 - Mon, 5 - Fri
        //8 - Not allowed

        //int_day = Integer.parseInt(args[0]); - CLI Option

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day num(1 to 7)");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Mon");
            case 2:
                System.out.println("Tue");
            case 3:
                System.out.println("Wen");
            case 4:
                System.out.println("Thu");
            case 5:
                System.out.println("Fri");
            case 6:
                System.out.println("Sat");
            case 7:
                System.out.println("Sun");
            default:
                System.out.println("Invalid number");

        }
    }
}
