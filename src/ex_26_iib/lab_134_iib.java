package ex_26_iib;

public class lab_134_iib {
    public static void main(String[] args) {
        A a = new A();
        //IIB
        // Instance intialization block
        // I will be executed when object is created
        // IIB are called first (before DC)

    }



}

class A{
    A(){
        System.out.println("DC");

    }
    {
        System.out.println("Hi, I am IIB");
        System.out.println("If you want to execute or call something");
        //Read JSON/CSV
        // run SQL connection

    }
    {
        System.out.println("Hi, I am IIB 2");
    }


}
