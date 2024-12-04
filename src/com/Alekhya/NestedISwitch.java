package com.Alekhya;

import java.util.Scanner;

public class NestedISwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter EmpID");
        int empId = in.nextInt();
        String dept = in.next();

        switch (empId) {
            case 1 :
                System.out.println("com/Alekhya");
                break;
            case 2 :
                System.out.println("Satya");
                switch (dept) {
                    case "IT" :
                        System.out.println("IT department");
                        break;
                    case "Management" :
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("No dept entered");
                }
                break;
            default:
                System.out.println("Please enter correct empoyeeID");
        }

    }
}
