package ex_24_OOPS_Abstraction;

public class lab_131_Ab_Car {
    public static void main(String[] args) {
        WagonR car = new WagonR();
        car.drive();
    }


}


abstract class Engine{
    abstract void startEngine();
    abstract void stopEngine();


}

class WagonR extends Engine{


    @Override
    void startEngine() {
        System.out.println("Starting the Car");

    }

    @Override
    void stopEngine() {
        System.out.println("Stoping the Car");
    }

    void drive(){
        System.out.println("Driving");
    }
}