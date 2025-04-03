package ex_20_Polymorphism.Overriding;

import Inheritance.CommonToAll;

public class lab_119_real_Ex_method_overriding {
    public static void main(String[] args) {
        chrome c1 = new chrome();
        c1.openBrowser();

        Firefox f1 = new Firefox();
        f1.openBrowser();

        commontoAll cm1 = new commontoAll();
        cm1.openBrowser();

        //Dynamic Dispach
        commontoAll c2 = new chrome();
        c2.openBrowser();

        commontoAll c3 = new Firefox();
        c3.openBrowser();



    }



}

class commontoAll{
    void openBrowser(){
        System.out.println("Open the IE Browser");
    }

}

class chrome extends commontoAll{

    @Override
    void openBrowser(){
        System.out.println("chrome will start");

    }
}
class Firefox extends commontoAll{

    void openBrowser(){
        System.out.println("Firefox will start");

    }
}