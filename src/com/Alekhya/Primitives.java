package com.Alekhya;
import java.util.Scanner;

public class Primitives {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.println("please enter the rollno:");
       int rollno = input.nextInt();
       System.out.println("The entered rollno is: " + rollno);

       String name = input.next();
       System.out.println(name);

       float marks =  input.nextFloat();
       System.out.println(marks);

        }

    }
