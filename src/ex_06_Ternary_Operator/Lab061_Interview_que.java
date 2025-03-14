package ex_06_Ternary_Operator;

public class Lab061_Interview_que {
    public static void main(String[] args) {
        //Nested Ternary
        int number = 25;
        String  result1 = number > 5 ? (number > 20 ? "N>20" : "N<20") : "B";
        String  result2 = number > 5 ?  "B" : (number > 20 ? "N>20" : "N<20");
        System.out.println(result1);
        System.out.println(result2);

        int age = 23;
        // Adult (age > 18), Minor (age < 18) , Senior (Age >65)
    }
}
