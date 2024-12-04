package com.Alekhya;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    //two pointer method using start and end pointers here
    static void reverse(int[] arr1) {
        int start = 0;
        int end = arr1.length-1;
        while(start<end) {
            swap(arr1, start, end);
            start++;
            end--;

        }

    }

    static void swap (int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
