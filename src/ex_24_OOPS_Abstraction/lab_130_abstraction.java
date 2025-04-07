package ex_24_OOPS_Abstraction;

public class lab_130_abstraction {
    public static void main(String[] args) {

        Child c = new Child();
        c.loan50k();
        c.loan25k();

        //Father f1 = new Father();
        Father f2 = new Child();


    }


}

abstract class Father{
    abstract void loan50k();
    void loan25k(){
        System.out.println("Given 25k");
    }

}

class Child extends Father{


    @Override
    void loan50k() {

    }
}
