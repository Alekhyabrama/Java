package com.Alekhya;

import java.util.Scanner;

public class CelsiusProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter temp in celsius:");
        float tempC = in.nextFloat();
        float tempf = (tempC*9/5) + 32;
        System.out.println(tempf);

    }
}
