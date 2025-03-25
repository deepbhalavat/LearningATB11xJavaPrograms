package ex_14_String;

public class lab097_String_function {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println(c);

        String s1 = "Deep";
        System.out.println(s1.length());
        System.out.println(s1.charAt(3));// it will start with 0 >> p
        // System.out.println(s1.charAt(10));// it will give exception
        System.out.println(s1.toLowerCase());
        System.out.println(s1.concat(" bhalavat"));

        // Contain
        System.out.println(s1.contains("de"));

        System.out.println(s1.equals("deep"));

        System.out.println(s1.indexOf("e"));

        System.out.println(s1.replace('e', 'E'));

        //Split
        String name4 = "pramod@live.com@123";
        String[] split = name4.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        //Substring
        System.out.println("Substring");
        System.out.println(s1.substring(1,3)); /// start index to end index -1

        System.out.println(s1.startsWith("D"));
        System.out.println(s1.endsWith("P"));

        String s111 = "Deep ";
        String s112 = "P ";
        String s113 = "Bhalavat";
        System.out.println(s111 + s112 + s113);
        System.out.println(s113.indexOf("a"));
        System.out.println(s113.indexOf("d"));
        System.out.println(s113.lastIndexOf("a"));




    }
}
