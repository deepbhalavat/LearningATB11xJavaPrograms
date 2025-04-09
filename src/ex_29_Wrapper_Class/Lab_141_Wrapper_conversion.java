package ex_29_Wrapper_Class;

public class Lab_141_Wrapper_conversion {
    public static void main(String[] args) {

        int a = 10;
        Integer b = a; // Boxing
        // Primitive to wrapper
        System.out.println(b.intValue());
        System.out.println(Integer.MAX_VALUE);

        Integer a2 = 42;
        int v = a2; // Unboxing > Wrapper is removed, Attributes and behaviour is lost
        System.out.println(v);

        String num = "10";
        int aaa = 10;

        // String to Wrapper >  parseX()
        Integer c = Integer.parseInt(num);
        Integer c1 = Integer.valueOf(num);


        // String to primitive
        int aa =  Integer.parseInt(num);

    }
}
