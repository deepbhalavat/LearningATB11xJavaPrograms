package Tasks;

public class Task02_Java_Math {
    public static void main(String[] args) {
        int x = 10, y = 10, z = 10;
        float Result = 0;
        Result = (float) Math.sqrt((Math.pow(x,2) + Math.pow(y,2)) - z );
        System.out.println(Result);
        // System.out.println(Math.sqrt((Math.pow(x,2) + Math.pow(y,2)) - z ));
    }
}
