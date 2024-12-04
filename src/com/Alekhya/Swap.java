package com.Alekhya;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        swap(arr1, 0,2);
        System.out.print(Arrays.toString(arr1));

    }

    static void swap (int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
