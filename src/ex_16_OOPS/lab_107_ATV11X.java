package ex_16_OOPS;

public class lab_107_ATV11X {

    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2;
        // TIll now only one object and two referance
        new Cat();
        // Two object / Two ref

        c1.running();
//         c2.running(); > No possible as it dont have object
        System.out.println(new Cat().name);



    }


}

class Cat{

    String name; // Null > Default value
    int roll;
    void sleep(){

    }
    void running(){
        System.out.println("Running");

    }
}
