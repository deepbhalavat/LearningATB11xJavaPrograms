package Tasks;

import java.util.Scanner;

public class Task11_Palindrome {

//    Palidrome of String (chatAt()) - naman, → reverse - naman , madam ( string = rev(str)
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the name, I will check palindrome");
    String s1 = scanner.next();
    String reversed_String = "";

    for(int i=s1.length()-1;i >= 0;i--){
//        System.out.println(s1.charAt(i));
        reversed_String = reversed_String + s1.charAt(i);
    }
  //  System.out.println(reversed_String);
    if(s1.equalsIgnoreCase(reversed_String)){
        System.out.println("It's palindrome");
    }
    else {
        System.out.println("its not palindrome");
    }


}
}
