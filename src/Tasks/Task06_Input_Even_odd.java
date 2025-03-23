package Tasks;

import java.util.Scanner;

public class Task06_Input_Even_odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter one number");
        int a = scanner.nextInt();

        if(a % 2 == 0){
            System.out.println(a + " is Even number");
        }
        else {
            System.out.println(a + " is Odd number");
        }
    }
}
