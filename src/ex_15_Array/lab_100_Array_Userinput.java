package ex_15_Array;

import java.util.Scanner;

public class lab_100_Array_Userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ent tthe size of Array only");
        int size = sc.nextInt();

        int[] numbers_marks = new int[size];
        for(int i= 0 ; i < numbers_marks.length ; i++){
            System.out.println("Enter the number");
            numbers_marks[i] = sc.nextInt();
        }

        System.out.println("--------");
        for(int i= 0 ; i < numbers_marks.length ; i++){
            System.out.println(numbers_marks[i]);

        }
    }
}
