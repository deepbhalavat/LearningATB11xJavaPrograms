package ex_16_OOPS;

public class lab_106_oops {
    public static void main(String[] args) {
        Person deep = new Person();
        deep.name = "Bhalavat";
        System.out.println(deep.name);

        Person p2 = new Person();
        // Person - Class
        // P2 - Object Ref
        // new Person() - Object

        p2.name = "Bhalavat_2";
        System.out.println(p2.name);


    }


}

class Person{
    // Attribute | Properties | Instance Variable | Data Members
    String name;
    String phone;
    String color_eyes;
    int legs;
    double salary;
    byte age;
    boolean isMale;


    // Behaviour | Function | Method
    void sleep(){
        System.out.println("I am Sleeping");
    }

    String greet(String name){
        return "Hello" + name;
    }

    void talk(){
        System.out.println("i am Sleeping");
    }


}


