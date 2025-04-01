package Tasks;

public class Task10_FibonAcci_Seq {
    public static void main(String[] args) {
        // Fibonacci Sequence Generator
        //
        //The Fibonacci Sequence is a series of numbers where each number is the sum of the two preceding ones, starting from 0 and 1.
        //
        //Formula:
        //
        //F(n)=F(n−1)+F(n−2)F(n) = F(n-1) + F(n-2)F(n)=F(n−1)+F(n−2)

        int first_num = 0;
        int sec_num = 1;
        int sum = 0;
        int n = 20;

        for(int i = 0; i < n ; i++){
            //System.out.println("a_First num" + first_num);
            //System.out.println("a_Sec num" + sec_num);
            //System.out.println("a_sum" + sum);
            sum = first_num + sec_num;
            first_num = sec_num;
            sec_num = sum;
            System.out.println(sum);

//            System.out.println("First num" + first_num);
//            System.out.println("Sec num" + sec_num);
//            System.out.println("sum" + sum);
//


        }

    }
}
