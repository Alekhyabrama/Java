package com.Alekhya;

import java.util.Arrays;
import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       long[] arr =  printFibb(n);
        System.out.println(Arrays.toString(arr));

    }
    //Function to return list containing first n fibonacci numbers.
    static long[] printFibb(int n)
    {
        //Your code here
        long[] arr = new long[n];
        long num1 = 1, num2= 1, num3= 0;
        for(int i =0; i< n; i++){
            arr[i] = num1;
            num1 = num2 + num3;
            num3 = num2;
            num2 = num1;
        }
        return arr;
    }
}
