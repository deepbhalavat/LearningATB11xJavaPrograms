package Ex_04_Type_Casting;

public class Lab034_Type_Cast {
    public static void main(String[] args) {
        // Widening
        //Implicit Widening
        byte b = 10;
        int a = b; // Valid syntax
        //Explicit Casting -- In case of widening its not required
        int a1 = (int)b;

        //Narrowing
        int val = 200;
        // byte b1 = val // Invalid - Narrowing - Implicit Casting is not allowed
        byte b2 = (byte)val; // Valid - Narrowing - Explicit Casting - Allowed
        System.out.println(b2);

        long phone_no = 9898959898L;
        // short s = phone_no; // implicit Narrowing not possible
        short s1 = (short) phone_no; // Explicit Narrowing
    }
}
