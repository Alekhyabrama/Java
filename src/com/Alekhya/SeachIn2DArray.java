package Alekhya;

import java.util.Arrays;

public class SeachIn2DArray {
    public static void main(String[] args) {
        int[][] arr = new int[][] {
                {23,4,1},
                {18,12,3,8},
                {78,99,34,56},
                {18,12},
        };

        int target = 18;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target) {
                    return new int[]{row,col};
                }
            }

        }
        return new int[]{-1,-1};
    }
}
