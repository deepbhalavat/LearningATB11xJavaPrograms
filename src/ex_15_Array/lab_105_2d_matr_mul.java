package ex_15_Array;

import java.util.Scanner;

public class lab_105_2d_matr_mul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = scanner.nextInt();

        for(int i = 0; i< n; i++){
            for(int j = 0; j <= i ; j++){
                System.out.print(i * j + "\t");

            }
            System.out.println("");


        }

    }
}
