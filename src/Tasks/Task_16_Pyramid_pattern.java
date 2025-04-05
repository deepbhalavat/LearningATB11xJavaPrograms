package Tasks;

import java.util.Scanner;

public class Task_16_Pyramid_pattern {
    public static void main(String[] args) {
/*

00 01 02 03 04 05 06
10 11 12 13 14 15 16
20 21 22 23 24 25 26
30 31 32 33 34 35 36

    *
   ***
  *****
 *******
*********
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the pyramid height");

        int height = scanner.nextInt();

        for(int i=0;i<height;i++){
            for(int j=0;j<height - i;j++){
                System.out.print(" ");
            }
            for (int k =1;k<=(2*i -1);k++){
                System.out.print("*");
            }
            System.out.println("");
        }

        }

}
