package Interview_Questions;

import java.util.Arrays;

public class Int_Array {
    public static void main(String[] args) {
        int [] marks = {1,2,3,4,5,6,7};
        System.out.println(marks.length);
    // Nagative array size exception
        // int marks3[] = new int[-1];

        String s1 = "Deep";
        System.out.println(s1.length());

        ///  Max and minimum number from Array
        // maximum
        //int max_output = give_me_max(array);



        int max = 0;
        for(int i = 0 ; i < marks.length ; i++){
            if(marks[i] > max){
                max = marks[i];
            }
            else {

            }
        }
        System.out.println("Maximum number is " + max);


        System.out.println("Reverse Array");
        for(int i = marks.length - 1 ; i >=  0 ; i--){
            System.out.println(marks[i]);
        }

        int sum = 0;
        System.out.println("Sum of Array");
        for(int i = 0 ; i < marks.length ; i++){
            sum = sum + marks[i];
        }
        System.out.println("Sum is " + sum);

        // Enhanced for loop
        int sum1 = 0;
        for(int n : marks){
            sum1 = sum1 + n;
        }
        System.out.println("sum1 is " + sum1);

        ///  Second highest number
        Arrays.sort(marks);
        System.out.println(marks[0]);
        System.out.println(marks[marks.length-2]);
    }
}
