package Tasks;

public class Task_17_OOPS_Constructor {
    public static void main(String[] args) {
        Person3 p1=new Person3();
        p1.greetperson();
        System.out.println("Your number is " + p1.yournumber());
        p1.eat("Pizza");
        p1.number(12345677L);
        p1.sleep("Deep");
        p1.walk((byte) 31);
        p1.doHome(Boolean.TRUE);

    }
}


class Person3 {
    String name;
    Byte age;
    String address;
    Long phone;
    Boolean isATB11XStudent;

    //1
    void greetperson() {
        System.out.println("Hello, How are you..!!");
    }

    //2
    int yournumber() {
        return 33;
    }

    //3
    String eat(String name) {
        return "hello, you are eating " + name;
    }

    //4
    void number(Long phone) {
        System.out.println("Your phone number is " + phone);
    }

    void sleep(String name) {
        System.out.println(name + " is sleeping");
    }

    void walk(Byte age) {
        System.out.println(age + " is age of person an he is walking");
    }

    void doHome(Boolean isATB11XStudent) {
        System.out.println("user is ATB11x student");
    }



}

