package ex_13_Functions;

public class lab091_User_Defined_functions {
    public static void main(String[] args) {
        //User defined functions
        // Without Parameters without return type
        wp_wr_greet();
        // int a = wp_wr_greet(); >>

        // Without Parameters with return type
        St_with_hello_wp_withRT();
        String a = St_with_hello_wp_withRT();
        System.out.println(a);

        // With Parameters without return type

        // With Parameters with return type

    }
//1
    static void wp_wr_greet(){
        System.out.println("Hi, How are you");
    }
    //2
    static String St_with_hello_wp_withRT(){
        System.out.println("Hi");
        return "Hi, How are you?";
    }
    //3
    static void greet_with_details(String name, int age, double salary){
        System.out.println("Your name is ->" + name + "\nYour age is " + age + "\nYour salary is " + salary);
    }
    //4
    static int sum_of_three_number(int a,int b,int c){
        return a+b+c;
    }

}
