package ex_09_Switch;

import java.sql.SQLOutput;

public class lab075_JDK13above {
    public static void main(String[] args) {
        // in JDK > 13
        int itemcode = 006;
        switch (itemcode){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            case 004 -> System.out.println("Default");
            case 005,006,007 -> System.out.println("Default");

        }
    }
}
