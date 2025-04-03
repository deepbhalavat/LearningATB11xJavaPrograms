package ex_20_Polymorphism.MethodOverlaoding;

public class lab_117_methodoverloading {
    Mathoperation m1 = new Mathoperation();
    int r1 = m1.add(3,4);
    int r2 = m1.add(3,4,5 );
    double r3 = m1.add(3.14,5.16);

    // Same function name but different parameter and diff return type



}

class Mathoperation{
    //Method with same name but diff arg

    int add(int a,int b){
        return a + b;
    }
    int add(int a,int b, int c){
        return a + b + c;
    }
    double add(double a,double b){
        return a + b;
    }


}