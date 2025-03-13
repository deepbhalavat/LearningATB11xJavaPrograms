package ex_03_Literals_P1;

public class Lab031_Operators {
    public static void main(String[] args) {
        int age = 90;
        //int - Data type
        // age - identifier
        // 90 - Literal
        // = - Assignment operator
        // Assign value from RHS to LS

        /*Arithmetic operators
        +
        -
        *
        /



         */
        int a = 20;
        int b = 3;
        float c = 3f;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a%b); // Give remainder // 2
        System.out.println(a/b); // 6 --- No float value
        System.out.println(a/c); // 6.666 >> if we divide with float result will be in float

        // Unary Operator
        int d = +10;
        int d1 = -110;
        int result = d+d1;
        System.out.println(d);
        System.out.println(d1);
        System.out.println(result);

        // Relational Operator
        /* < Less than
           <=
           >
           >=
           ==
           !=
         */
        int f = 10;
        int g = 30;
        boolean h = f > g;
        System.out.println(h);

        int age_d = 40;
        int age_p = 30;
        boolean result1 = age_d > age_p;
        System.out.println(result1);

        boolean q = true;
        System.out.println(!q);

        // == compare the values
        System.out.println( 10 == 10);
        System.out.println( 10 < 10);
        System.out.println( 10 == 20);
        System.out.println( 10 >= 10);
        System.out.println( !(10 > 20));

        // || or gate
        // && And gate






    }
}
