package com.Alekhya;

import java.util.Scanner;

public class SwitchStatment {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println("please give fruit name: ");
        System.out.println("Enter day: ");
        //String fruit = in.next();

//        if (fruit.equals("mango")) {
//            System.out.println("king of fruit");
//        }
//
//         if (fruit .equals("apple")) {
//             System.out.println("sweet fruit");
//         }
//          if (fruit.equals("grape")) {
//              System.out.println("small fruit");
//          }


        // click alt + enter the syntax will change:
//
//        switch (fruit) {
//            case "Mango" -> System.out.println("king of fruit");
//            case "Apple" -> System.out.println("sweet fruit");
//            case "Grape" -> System.out.println("small fruit");
//            default -> System.out.println("please enter valid fruit name");
       // }
        int day = in.nextInt();
        switch (day) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
        }

    }
}
