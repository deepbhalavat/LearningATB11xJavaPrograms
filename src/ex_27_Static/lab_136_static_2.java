package ex_27_Static;

public class lab_136_static_2 {
    public static void main(String[] args) {
        B.commonToAll();
        B b_ref = new B();
        b_ref.display();
    }


}

class B{
    static {
        System.out.println("SIB, Called once");
    }

    int a; // Non static > Instance variable >Attributes
    static int b = 20;

    //A(int a){
   //     this.a =a;
    }
    //void display(){
      //  System.out.println("non Static");

//    }
//    static void commonToAll(){
//
//        System.out.println("Static");
//    }


}
