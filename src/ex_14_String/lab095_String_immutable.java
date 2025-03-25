package ex_14_String;

public class lab095_String_immutable {
    public static void main(String[] args) {
        String name = "deep";
        name.toUpperCase(); // DEEP >> THis will create another string
        System.out.println(name); // this will always point to older value

        String s1 = "hello";
        s1 = s1.concat("world");
        System.out.println(s1);
    }
}
