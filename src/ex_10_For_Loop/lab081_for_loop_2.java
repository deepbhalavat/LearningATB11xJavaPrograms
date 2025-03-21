package ex_10_For_Loop;

public class lab081_for_loop_2 {
    public static void main(String[] args) {
        for(long i=1l ; i<10 ; i++){
            System.out.println(i);
        }
        for(float f = 0.0f ; f<10 ; f++){
            System.out.println("Hi, Float " + f);
        }
        int j = -1; // we can put initial condition outside
        for( ; j<10 ; j++){
            System.out.println("minus " + j);
        }


    }
}
