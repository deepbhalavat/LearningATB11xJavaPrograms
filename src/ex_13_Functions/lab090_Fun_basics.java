package ex_13_Functions;

public class lab090_Fun_basics {
    public static void main(String[] args) {
        // step2 ->Call
        f1();
        name_of_function();
        int a = return_Int();
        System.out.println(a);

        float pi = return_of_pi();
        System.out.println(pi);

    }
    //step 1 > Def
    static void f1() {
        System.out.println("Hi");
    }
    static void name_of_function(){
        System.out.println("Hi this is function examples");
    }
    static float return_of_pi(){
        return 3.14f;
    }
    static int return_Int(){
        return 10;
    }

}
