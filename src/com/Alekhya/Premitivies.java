package com.Alekhya;

import java.util.Arrays;
import java.util.Scanner;

public class Premitivies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //array of premitives
        int[] arr = new int[5];
        arr[0] = 3;
        arr[1] = 5;
        arr[2] = 6;
        arr[3] = 7;
        arr[4] = 9;
        //System.out.println(arr[3]);

        //input using loops
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        //output

        System.out.println(Arrays.toString(arr)); //best way to ouput the array.

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
////        }
//         for(int num : arr) { // for every elemet in array print the element
//             System.out.print(num + " "); // here num represents element of the array
//         }
    }
}
