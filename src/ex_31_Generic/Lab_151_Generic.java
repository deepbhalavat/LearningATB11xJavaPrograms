package ex_31_Generic;

public class Lab_151_Generic {
    public static void main(String[] args) {
        // T is being most common used
        temp_sum(3,4);
        temp_sum(3.34,4.45);
        temp_sum("Deep","Bhalavat");



    }

    static int temp_sum(int a, int b){
        return a+b;

    }
    static double temp_sum(double a, double b){
        return a+b;

    }
    static String temp_sum(String a, String b){
        return a+b;

    }
    static <T> T temp_sum(T a, T b){ // static <Deep> Deep temp_sum(Deep a, Deep b)
        System.out.println(a);
        System.out.println(b);
        return null;

    }

}
