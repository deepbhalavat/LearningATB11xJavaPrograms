package Tasks;

public class Task04_ID_Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //System.out.println(++a); //11
        //System.out.println(a++); //11
        //System.out.println(a++); //12
        System.out.println(++a + a++ + a++); // 34

        System.out.println(--b + b++ + b--); // 58
    }
}
