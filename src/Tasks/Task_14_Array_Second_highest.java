package Tasks;

public class Task_14_Array_Second_highest {
    public static void main(String[] args) {
        int[] marks = {52, 78, 52, 97, 43, 86, 99 , 100 , 33, 45, 56};
        int max = 0;
        int second_hig = 0;

        // logic
        // a0 is max?? > yes? > replace it with max > No replace it with second high
        // a1 is max?? >
        for(int i = 0 ; i < marks.length ; i++){
            if(marks[i] > max){
                    max = marks[i];
                    System.out.println("1");
            }
            else{
            second_hig = marks[i];
            }
        }
            System.out.println("max is " + max);
            System.out.println("second hig is " + second_hig);


        }
    }
