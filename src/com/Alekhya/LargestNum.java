package com.Alekhya;

import java.rmi.MarshalException;
import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b= in.nextInt();
        int c= in.nextInt();
        //int max=0;
//        if(a>b) {
//            max=a;
//        } else
//            max = b;
//        if(c>max) {
//            max =c;
//        }
        //System.out.println(max);
        int max = Math.max(c, Math.max(a,b));
        System.out.println(max);
    }
}
