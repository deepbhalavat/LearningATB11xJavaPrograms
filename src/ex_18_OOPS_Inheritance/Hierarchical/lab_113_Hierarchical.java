package ex_18_OOPS_Inheritance.Hierarchical;

public class lab_113_Hierarchical {
    public static void main(String[] args) {

        Father f1 = new Father();
        Jagruti j2 = new Jagruti();

        j2.home();
        f1.home();

        Deep d1 = new Deep();
        d1.home();

        Sachin s1 = new Sachin();
        s1.s2();
        s1.home();

    }




}

class Father{
    void home(){
        System.out.println("3BHK");

    }

}

class Deep extends Father{
    void h2(){
        System.out.println("h2-Deep");
    }
}

class Sachin extends Father{
    void s2(){
        System.out.println("s2-Sachin");
    }
}

class Jagruti extends Father{
    void j2(){
        System.out.println("j2-Jag");
    }
}