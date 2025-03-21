package Interview_Questions;

import java.util.Scanner;

public class Int_While_loop {
    public static void main(String[] args) {
        //Factorial Number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Factorial number \n Enter the number");
        int number = scanner.nextInt();

        int factorial = 1;
        int factorial_w = 1;

        int j = 1;
        if(number <= 0) {
            System.out.println(factorial);
        }
//        }else {
//            for(int i = 1; i <= number ; i++){
//                factorial = factorial*i;
//            }
         else {
            while(j <= number){
                factorial_w = factorial_w*j;
                j++;
            }

        }
        System.out.println("Factorial is -> " + factorial);
        System.out.println("Factorial is -> " + factorial_w);



//        int i = 0;
//        while (true){
//            System.out.println("Hello Deep");


    }

}
