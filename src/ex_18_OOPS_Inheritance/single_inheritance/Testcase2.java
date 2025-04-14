package ex_18_OOPS_Inheritance.single_inheritance;

public class Testcase2 extends Commontoall{
    void runningTC2(){
        startbrowser();
        System.out.println("Running TC2");
        readExcelFile();
        readDB();
        closeBrowser();
    }
}
