package Tasks;

public class test2 {
    public static void main(String[] args) {
        Person2 p1=new Person2();
        p1.greetPerson();//Without parameter & without Return type
        p1.greetPersonName("Deep"); //With parameter but without Return type
        System.out.println("Your age is "+p1.greetPersonAge());  //Without parameter but with Return type
        System.out.println(p1.greetPersonDetails("Deep","Bhalavat"));// With Parameter and with Return Type


    }

}

class Person2{
    String name;
    byte age;
    boolean isMarried;
    char gender;
    int legs;

    void greetPerson()
    {
        System.out.println("Hello, How are you!");
    }

    void greetPersonName(String name1){
        System.out.println("Hello, your name is "+name1);
    }

    public int greetPersonAge()
    {
        return 32;
    }

    public String greetPersonDetails(String fName,String lName)
    {
        return "Your First name is "+fName+" Your surname is "+lName;
    }
}
