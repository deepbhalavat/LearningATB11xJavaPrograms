package ex_12_Do_While_loop;

public class lab088_Do_While_loop {
    public static void main(String[] args) {
        int a = 0;
        while (a < 0){
            System.out.println(a);
            a++;
        }
        System.out.println("While loop completed");
        do{
            System.out.println("This is a Body which execute 1 time for sure");
            System.out.println(a);
            a++;
        }while (a < 0);
    }
}
