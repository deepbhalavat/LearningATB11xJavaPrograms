package ex_18_OOPS_Inheritance.Multilevel_inh;

public class lab_112_multilevel_inh {
    public static void main(String[] args) {


        GrandFather gf = new GrandFather();
        gf.gf();
        System.out.println( " --- ");


        Father f1 = new Father();
        f1.gf();
        f1.f();
        System.out.println( " --- ");

        Son s1 = new Son();
        s1.gf();
        s1.f();
        s1.s();
        System.out.println( " --- ");


        // Interview Que
     //   Son s1 = new GrandFather();
     //   Son s1 = new Father();
        Son amit =new Son();

        GrandFather g1 = new Son();  // Dynamic Dispatch
        g1.gf();
        g1.home();

        GrandFather g2 = new Father();
        g2.home();

        Father f2 = new Son();
        f2.home();
     //   Father f3 = new GrandFather();





    }
}
