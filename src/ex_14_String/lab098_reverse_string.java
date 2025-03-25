package ex_14_String;

import java.util.Scanner;

public class lab098_reverse_string {
    public static void main(String[] args) {
        // array of char
        //madam >  madam
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input, i will check palindrome");
        String userInput = sc.next();
        //String newString = reverseString(userInput);
        String newString = reverseStringSB(userInput);
        if (newString.equalsIgnoreCase(userInput)){
            System.out.println("Palidrone");
        }
        else{
            System.out.println("Not palindome");
        }
    }
//
//    private static String reverseString(String userInput) {
//        String reversed = "";
//        for(int i = userInput.length() - 1; i>=0; i++){
//            reversed = reversed + userInput.charAt(i);
//        }
//        return reversed;
//    }


    private static String reverseStringSB(String userInput) {
     StringBuilder stringBuilder = new StringBuilder(userInput);
     return stringBuilder.reverse().toString();
    }
}
