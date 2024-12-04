package Alekhya;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {3,5,1},
        };
        System.out.println(maximumWealth(arr));
    }
    static int maximumWealth(int[][] difaccounts) {
        //person = rol
        //account=col
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < difaccounts.length; person++) {
            //when you start a new col, take a new sum for that row
            int sum = 0;
            for (int account = 0; account < difaccounts[person].length; account++) {
                sum = sum+difaccounts[person][account];

            }
            if(sum > ans) {
                ans = sum;
            }

        }
        return ans;


    }
}
