package com.Alekhya;
import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter the 1st number:");
        int num1 = input.nextInt();

        System.out.print("enter the 1st number:");
        int num2 = input.nextInt();
        int sum = num1+num2;
        System.out.println("The sum of two numbers is:" +  " " + sum);
    }
}
