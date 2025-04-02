package ex_18_OOPS_Inheritance;

public class lab_110_Inheritance {
    public static void main(String[] args) {
        Father f1 = new Father();
        System.out.println(f1.gold_f);

        Son s1 = new Son();
        s1.bhk3P();
        System.out.println(s1.gold_f); // as we extend so now we can access Fathers A|B
        s1.bhk2(); // as we extend so now we can access Fathers A|B


    }

}

class Father{
    int gold_f = 1000;  // Attri

    void bhk2(){ // Behaviour
        System.out.println("Father - 2BHK");
    }

}

class Son extends Father{
    void bhk3P(){

        System.out.println("3BHK Son");
    }

}

class Brother extends Father{


}