package Interview_Questions;

public class Int_String {
    public static void main(String[] args) {
        String s1 = "Hello"; //SCP
        String s4 = "Hello"; // SCP
        String s10 = "Hello"; // SCP

        // How many strings will be in String constant pool >> Ans : one

        String s2 = new String("Hello"); // OA
        String s3 = new String("Hello");
        String s5 = new String("hello");

        // How many strings will be in String constant pool >> Ans : Three

        // == is for comparison  > String >> Always check location ref.
        System.out.println(s1 == s2); // False -- as both are in different location
        System.out.println(s1 == s3); // False -- as both are in different location
        System.out.println(s5 == s3); // False -- as both are in different location
        System.out.println(s1 == s4); // True -- as both are in Same location due to SCP.
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s5.equals(s3)); // as case not match // False >> Hello | hello
        System.out.println(s5.equalsIgnoreCase(s3)); // to ignore case // True



    }
}
