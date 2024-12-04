package com.Alekhya;

public class Maximum {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,45};

        //System.out.println(max(arr));
        System.out.println(maxRange(arr, 1, 3));
    }

        //maxrange
    // work on edge cases here, like array being null
        static int maxRange(int[] arr, int start, int end) {
        if(end > start) {
            return -1;
        }
        if(arr ==  null) {
            return -1;
        }
        int maxVal = arr[start];
        for(int i= 1; i <= end; i++) {
            if(arr[i] > maxVal) {
                maxVal = arr[i] ;
            }
        }
        return maxVal;
        }


    static  int max(int[] arr) {
        //edge case here
        if(arr.length == 0) {
            return -1;
        }
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
