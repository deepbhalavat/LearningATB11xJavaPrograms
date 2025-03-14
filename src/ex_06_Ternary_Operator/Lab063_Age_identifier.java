package ex_06_Ternary_Operator;

import java.util.SplittableRandom;

public class Lab063_Age_identifier {
    public static void main(String[] args) {
        //int age = 23;
        // Adult (age > 18), Minor (age < 18) , Senior (Age >65)
        // Take an input from user
        String age1 = args[0];
        System.out.println(age1);
        System.out.println(age1 instanceof String);

        int age = Integer.parseInt(age1);
        String result = (age < 18) ? "Minor" : (age < 65) ? "Adult" : "Senior";
        System.out.println(result);
        System.out.println(age1);
    }
}
