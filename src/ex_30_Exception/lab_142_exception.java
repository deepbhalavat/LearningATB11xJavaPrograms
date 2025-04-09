package ex_30_Exception;

public class lab_142_exception {
    public static void main(String[] args) {
        System.out.println("Starting the programm");
        String input_user = args[0]; // main" java.lang.ArrayIndexOutOfBoundsException:
        int a = Integer.parseInt(input_user);
        int output = 100/a; // if we pass 0, "main" java.lang.ArithmeticException
        System.out.println(output);
        System.out.println("End of program");

        String name = null; // "main" java.lang.NullPointerException: Cannot invoke "String.trim()" because "name" is null
        name.trim();


    }

}
