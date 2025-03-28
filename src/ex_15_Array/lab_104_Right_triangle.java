package ex_15_Array;

import java.util.Scanner;

public class lab_104_Right_triangle {
    public static void main(String[] args) {

        // Pattern??
        // n =3
        // *
        // * *
        // * * *

        Scanner scanner = new Scanner(System.in);
        System.out.println("print the pattern you want to print");
        int n = scanner.nextInt();

        for(int i = 0; i< n; i++){
            for(int j = 0; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println("");


        }

/*        for(int k = 0; k< n; k++){
            for(int l = 0; l <= k ; l++){
                System.out.print("*");
            }
            System.out.println("");

*/
        }

    }

