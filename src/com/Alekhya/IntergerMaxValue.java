package com.Alekhya;

import java.util.Arrays;

public class IntergerMaxValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        for(int i=0;i< arr.length;i++){
            int t=arr[i];
            arr[i]=arr[arr.length-1];
            arr[arr.length-1]=t;
        }
        System.out.println(Arrays.toString(arr));

        }
    }
