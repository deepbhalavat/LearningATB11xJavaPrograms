package ex_17_OOPS_Constructor;

public class lab_109_Parameter_constructor {
    public static void main(String[] args) {
        // This is used to intialize the value while creating the object
        Car c1 = new Car();
        System.out.println(c1.name);
        System.out.println(c1.year);
        System.out.println(c1.model);

        Car2 c3 = new Car2("Model 3", "Tesla", 2015);
        System.out.println(c3.name2);
        Car2 c4 = new Car2("Mahidra", "Thar Rox", 2024);
        System.out.println(c4.name2);
        Car2 c5 = new Car2("Curv", "Tata", 2024);
        System.out.println(c4.name2);
        Car2 c6 = new Car2("", "Kia"); // Constructor Overloading
        System.out.println(c6.name2);
        System.out.println(c6.model2);


    }
}

class Car {
    String name;
    int year;
    String model;
    // Default
    Car() {
        name = "Unknown Car";
        year = 1991;
        model = "XYZ";

    }

}

// This is used to initialize the value while creating the object
class Car2 {
    ;
    String name2;
    String model2;
    int year2;

    Car2(String model2_oc_args, String name2_oc_args, int year2_oc_args) {
        this.name2 = name2_oc_args;
        this.model2 = model2_oc_args;
        this.year2 = year2_oc_args;
    }

    // Constructor Overloading -- Same name and two args.
    Car2(String model2_oc_args, String name2_oc_args) {
        this.name2 = name2_oc_args;
        this.model2 = model2_oc_args;
    }


}

