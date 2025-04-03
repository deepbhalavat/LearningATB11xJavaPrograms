package ex_20_Polymorphism.Overriding;

public class lab_118_overriding {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.sound();
    }

}

class Animal{
    void sound(){
        System.out.println("Animal Sound!!");
    }

}

class dog extends Animal{
    @Override
    void sound(){
        System.out.println("Bark!!");
    }

}


