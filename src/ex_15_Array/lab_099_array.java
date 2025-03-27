package ex_15_Array;

public class lab_099_array {
    public static void main(String[] args) {
        int a = 10;
        int [] marks = {91,90,51,100,85,92,89};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[4]);

        // second way:
        // Fixed size
        int[] marks2 = new int[5];
        int marks3[] = new int[5]; // Fixed size

        String[] names = new String[3];
        names[0] = "Deep";
        names[1] = "P";
        names[2] = "Bhalavat";
        System.out.println(names);

        //System.out.println(marks2); give location

        String[] name2 = {"Deep", "p", "Bhalavat"};
        System.out.println(name2[0]);
        System.out.println(name2[1]);
        System.out.println(name2[2]);


        //System.out.println(marks[-1]);
        //System.out.println(marks[10]);
        System.out.println("-----Array Print------");
        for(int i = 0; i < marks.length ; i++ ){
            System.out.println(marks[i]);
        }
    }
}
