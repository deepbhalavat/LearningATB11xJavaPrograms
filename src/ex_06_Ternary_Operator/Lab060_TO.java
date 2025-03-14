package ex_06_Ternary_Operator;

public class Lab060_TO {
    public static void main(String[] args) {
        // ? :
        int age = 10;
        String canIVote = age >= 18 ? "Yes, You can Vote" : "No you can't Vote";
        System.out.println(canIVote);
        // result = Condition ? Expression 1 : Expression 2
        int number = -4;
        String  result1 = number > 5 ? "Positve" : "Nagetive";
        System.out.println(result1);

    }
}
