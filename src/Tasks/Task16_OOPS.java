package Tasks;

public class Task16_OOPS {
    public static void main(String[] args) {
        person deep = new person();
        deep.greet(" deep");
        deep.speaking();






    }

}

class person{

    int weight;
    float height;
    String name;
    byte age;
    boolean isMale;
    double salary;
    String hair_color;
    String eye_color;
    String country;
    String main_language;


    void speaking(){
        System.out.println("I am speaking");
    }

    void greet(String name){
        System.out.println("Hello" + name);
    }

    String gender_check(Boolean isMale){
        if(isMale == Boolean.TRUE){
            return "Male";

        }else{
            return "Female";
        }
    }

    String your_age(Byte age){
        return "your age is " + age;
    }




}
