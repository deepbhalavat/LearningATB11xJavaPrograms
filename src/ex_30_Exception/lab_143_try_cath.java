package ex_30_Exception;

public class lab_143_try_cath {

    public static void main(String[] args) {
        System.out.println("1");
        try{
            int a = 10/0;
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("2");
    }
}
