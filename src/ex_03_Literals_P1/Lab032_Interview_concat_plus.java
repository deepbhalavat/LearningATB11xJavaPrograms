package ex_03_Literals_P1;

public class Lab032_Interview_concat_plus {
    public static void main(String[] args) {
        //Concatination

        System.out.println("Deep" + "Bhalavat");

        int a = 10;
        int b = 20;
        System.out.println(a + b); // Math

        String name1 = "Deep";
        String name2 = "Bhalavat";
        System.out.println(name1+name2);
        System.out.println(name1 + name2 + a + b ); // if first operator is string all are string /DeepBhalavat1020
        System.out.println(a + b + name1 + name2 ); // if first operator is string all are string / 30DeepBhalavat
        System.out.println(a + b + name1 + name2 + a + b ); // if first operator is string all are string / 30DeepBhalavat1020
        System.out.println(a + b + name1 + name2 + (a + b) ); // if first operator is string all are string / 30DeepBhalavat30 // Bodmas
        System.out.println((9 * 3 / 9 + 1) * 3);

        int salary = 12;
        boolean r = !(salary > 10 || salary < 5);
        System.out.println(r);

        char a1 = 'A';
        char b1 = 'B';
        System.out.println(a1 + b1); // 131 -- Ascii sum 65+66





    }
}
