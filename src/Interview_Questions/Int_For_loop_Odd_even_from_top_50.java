package Interview_Questions;

public class Int_For_loop_Odd_even_from_top_50 {
    public static void main(String[] args) {
        // TO find the even numbers from 1 to 50
        // even > i%2 == 0
        for (int i = 0; i<=50; i++){
//            if(i % 2 == 0){
//                System.out.println("Even -> " + i);
//            }
//            else{
//                System.out.println("Odd -> " +i);
            if (i % 2 == 0) {
                System.out.println("Even -> " + i);
                continue; // if we use it will not going to below code and it will skip next lines in loop
                            }
            System.out.println("odd -> " + i);
        }
    }
}

