package Tasks;

public class Task_15_Array_Odd_Even {
    public static void main(String[] args) {
        int[] numbers={2,5,6,76,54,34,21,33,89};
        int[] odd_number={};
        int[] even_number={};

        for (int i =0; i<numbers.length; i++){
            if(numbers[i] % 2 == 0){
                odd_number[i] = numbers[i];
                System.out.println( numbers[i] + "is" + odd_number);
            }
            else {
                even_number[i] = numbers[i];
                System.out.println(numbers[i] + "is" +even_number);
            }


        }
        System.out.println("Odd numbers");
    }
}
