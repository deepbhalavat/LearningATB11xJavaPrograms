package Tasks;

import java.util.ArrayList;

public class Task_15_Array_Odd_Even {
    public static void main(String[] args) {
        int[] numbers={2,5,6,76,54,34,21,33,89};
        ArrayList<Integer> odd_number1 = new ArrayList<>();
        ArrayList<Integer> Even_number1 = new ArrayList<>();
        //int[] odd_number={};
        //int[] even_number={};

        for (int i =0; i<numbers.length -1; i++){
            if(numbers[i] % 2 == 0){
                Even_number1.add(numbers[i]);
                System.out.println( numbers[i] + "is even number");
            }
            else {
                odd_number1.add(numbers[i]);
                System.out.println(numbers[i] + "is odd number");
            }


        }
        System.out.println("Odd numbers are" + odd_number1 );
        System.out.println("Even numbers are" + Even_number1 );
    }
}
