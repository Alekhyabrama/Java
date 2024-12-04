package Alekhya;

public class MaxIn2DArray {
    public static void main(String[] args) {
            int[][] arr = new int[][] {
                    {23,4,1},
                    {18,12,3,8},
                    {78,34,56},
                    {18,12},
            };
        System.out.println(max(arr));
    }

    static int max(int[][] arr) {
        int max = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > max) {
                    max = arr[row][col];
                }
            }

        }
        return max;
    }
}
