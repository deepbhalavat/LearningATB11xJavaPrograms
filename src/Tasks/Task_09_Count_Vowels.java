package Tasks;

import java.util.Scanner;

public class Task_09_Count_Vowels {
    public static void main(String[] args) {
        //  Count vowels(a,e,i,o,u) and consonants in a String. → pramod, → vowels - 2, consonants - 4
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name1 = scanner.next();
        String name = name1.toLowerCase();
        int String_length = name.length();
        int vowels = 0;
        int consonants = 0;

        for(int i = 0; i < String_length ; i++ ){
            char a = name.charAt(i);
            if( a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'){
                vowels++;
            }
            else {
                consonants++;
            }


        }
        System.out.println("Vowels = " + vowels);
        System.out.println("consonants = " + consonants);

    }
}
