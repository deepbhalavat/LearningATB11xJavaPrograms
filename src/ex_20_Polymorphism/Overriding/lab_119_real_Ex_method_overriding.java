package ex_20_Polymorphism.Overriding;

import Inheritance.CommonToAll;

public class lab_119_real_Ex_method_overriding {
    public static void main(String[] args) {
        chrome c1 = new chrome();
        c1.openBrowser();

        Firefox f1 = new Firefox();
        f1.openBrowser();

        CommonToAll d1 = new CommonToAll();
      //  d1.openBrowser();



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