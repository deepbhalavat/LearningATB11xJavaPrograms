package ex_14_String;

public class lab096_String_Creation { public static void main(String[] args) {
        // Method of Creating string
        //
        String s1 = "deep"; //SCP -- Storage pool

        String s2 = new String("deep"); // Object pool

    // String Builder and String buffer
    // String Builder is not thread safe >> no synch > fast
    // String buffer is thread safe >> Sych > Slow
        StringBuffer stringBuffer = new  StringBuffer("Deep"); // Object Area
        StringBuilder stringBuilder = new StringBuilder("Deep"); // Object Area

    // four strings are created

    System.out.println(s1);
    System.out.println(s2);
    System.out.println(stringBuffer);
    System.out.println(stringBuilder);

    }
}
