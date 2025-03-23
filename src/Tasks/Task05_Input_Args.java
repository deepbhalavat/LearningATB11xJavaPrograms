package Tasks;

public class Task05_Input_Args {
    public static void main(String[] args) {
        // Take a user input 2 numbers from the arguments and calculate the maximum in between with ternary operator.
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(a);
        System.out.println(b);
        String max1 = (a > b) ? (a +" is Big compare to " + b) : (b + " is Big compare to " + a);
        System.out.println(max1);
//        if(a > b){
//            System.out.println( a + " is big number compare to " + b);
//        }
//        else{
//            System.out.println( b + " is big number compare to " + a);
//        }




    }
}
