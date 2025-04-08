package ex_27_Static;

public class lab_135_Static {
    public static void main(String[] args) {
        P a = new P();
        // Class(Static block) Reference = Object(Instance initialization block and Default constructor)
        P p2 = new P();
        P p3 = new P();

        //IIB > 3 > This run based on object created
        //DC > 3 >> This run based on the object created
        //SIB > 1 >> Class is loading only one time


    }
}

class P{
    {
        System.out.println("IIB");
    }
    P(){
        System.out.println("DC");
    }
    static {
        System.out.println("static");
    }


}
