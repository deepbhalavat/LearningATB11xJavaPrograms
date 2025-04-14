package Tasks;

public class Task_18_Opps_DC_PC {
    public static void main(String[] args) {
        Persond deep = new Persond();
        System.out.println(deep.name);
        System.out.println(deep.age);
        System.out.println(deep.phone);
        deep.eat();
        deep.sleep("deep");
        deep.walk("deep");
        deep.doHome();

        Persond d2 = new Persond("db", (byte) 21, 21234123l);
        System.out.println(d2.name);
        System.out.println(d2.age);
        System.out.println(d2.phone);

    }
}

class Persond{

    String name;
    Byte age;
    String address;
    Long phone;
    Boolean isMale;

    void eat(){
        System.out.println("person is eating");
    }
    void sleep(String name){
        System.out.println(name + " is sleeping");
    }
    String walk(String name){
        return name  + " is walking";
    }

    void doHome(){
        System.out.println("we all are doing homework");
    }

    Persond(){
        System.out.println("I am calling by default as i am default constructor");
        name = "deep";
        age = 31;
        phone = 1212121341l;

    }
    Persond(String new_name, Byte new_age, Long new_phone){
        this.name = new_name;
        this.age = new_age;
        this.phone = new_phone;

    }

}