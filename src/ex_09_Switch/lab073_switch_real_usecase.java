package ex_09_Switch;

import java.util.Scanner;

public class lab073_switch_real_usecase {
    public static void main(String[] args) {
        // Web automation
        // ask user : which broweser he wants to use
        // will start automation in that browser

        //String browser = args[0];
        //System.out.println(browser);
// Use any one input method

        Scanner scanner = new Scanner(System.in);
        String browser1 = scanner.next();

        switch (browser1){
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("TC1");
                System.out.println("TC2");
                System.out.println("TC3");
                break;
            case "firefox":
                System.out.println("Starting the firefox");
                System.out.println("TC1");
                System.out.println("TC2");
                System.out.println("TC3");
                break;
            case "Edge":
                System.out.println("Starting the Edge");
                System.out.println("TC1");
                System.out.println("TC2");
                System.out.println("TC3");
                break;
            default:
                System.out.println("Sorry its not supported");

        }

    }
}
