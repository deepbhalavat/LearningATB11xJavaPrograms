package ex_06_Ternary_Operator;

public class Lab062_Max_number {
    public static void main(String[] args) {
        // Find maximum Numbers
        int x = 10;
        int y = 20;
        int z = -12;
        System.out.println(Math.max(x,y));

        String max = x > y ? "X is max" : "Y is max";
        System.out.println(max);

        // Logic Building formulas
        // find input and output
        // Step 1
        // x,y,z - input
        // String > Max number - Output

        int max1 = (x>y) ? (x > z) ? x : y : ((y > z) ? y : z);
        System.out.println("Max is " + max1);
        // A > (x > z) ? x : y >>  We will be in this condition if x is greater then Y
        // B > ((y > z) ? y : z) >> Program will jump here if 1st condition is false (X>Y)




    }
}
