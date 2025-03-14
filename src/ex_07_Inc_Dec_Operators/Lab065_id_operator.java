package ex_07_Inc_Dec_Operators;

public class Lab065_id_operator {
    public static void main(String[] args) {



        int a = 10;
        int b = ++a; // 10 + 1 >> 11
        System.out.println(b); // 11
        System.out.println(a); // 11

        // Exp and Result Table
        // Line no | a  | Result b
        //   8     | 10 | NA
        //   9     | 11 | 11
        //   10    | 11 | 11
        //   11    | 11 | 11

        // Post increment
        int a_post = 10;
        int result = a_post++;
        System.out.println("Post_increment");
        System.out.println(a_post);
        System.out.println(result);





    }
}
