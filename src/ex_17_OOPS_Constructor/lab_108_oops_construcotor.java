package ex_17_OOPS_Constructor;

public class lab_108_oops_construcotor {
    public static void main(String[] args) {

        Baby b1 = new Baby();
        new Baby();
        Baby b2;


    }
}

class Baby{
    // Attributes
    String name;


    // Behaviour
    void cry(){
        System.out.println("Cry!!");

    }
    void eat(){
        System.out.println("Eat!!");

    }
    void sleep(){
        System.out.println("sleep!!");

    }

    // Default constructor // Non Parameterized  -- Auto called everytime when object is created
    Baby(){
        System.out.println("I am called, Default constructor");
        // Fetch data from SQL db
        // Read From CSV file, XLSX
        // Open file and read data(json, testdata.xlsx)
    }

}
