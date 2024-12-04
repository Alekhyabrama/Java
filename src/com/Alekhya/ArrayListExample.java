package com.Alekhya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);
//        list.add(60);
//        System.out.println(list);
//        System.out.println(list.contains(20)); // gives true here
//        list.set(0, 99);
//        System.out.println(list);
//        list.remove(20);


        //input
        for(int i=0; i < 10; i++) {
            list.add(in.nextInt());
        }

        //output
        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i));

        }




    }
}
