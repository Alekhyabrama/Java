package com.Alekhya;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {

        /* 1 2 3
            4 5 6
            7 8 9
         */

        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3]; // adding rows is mandatory here not columns

//        int[][] arr2D = {
//                {1,2,3}, //0th index
//                {4,5,6}, //1st index
//                {7,8,9}, //2nd index  ----> arr2D[2] = {7,8,9}
//
//        };

        //input

        for (int row = 0; row <arr.length; row++) {
            //for every coloumn in every row
            for (int col = 0; col < arr[row].length; col++){
               arr[row][col] =  in.nextInt();
            }
        }
        
        //output way:1

//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//            
//
//            //output way 2:
//            for (int row = 0; row < arr.length; row++) {
//                System.out.println(Arrays.toString(arr[row]));
//
//            }

        //output 3 way
        for(int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }

            
        }
    }

