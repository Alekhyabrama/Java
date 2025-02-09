package Alekhya;

import java.util.Arrays;

public class FirstandLastPosition {
    public static void main(String[] args) {
   int[] nums = {5,7,7,8,8,10};
   int target = 8;
   int[] anss = searchRange(nums,target);
        System.out.println(Arrays.toString(anss));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        //check the first occurence of target first

            int start = search(nums,target,true);
            int end = search(nums,target,false);
             ans[0] =start;
             ans[1] = end;
             return ans;
    }

        //this function just return the index value of the target
       static int search(int[] nums, int target, boolean findStartIndex) {
           int ans = -1;
           int start = 0;
           int end = nums.length - 1;
           while (start <= end) {
               //find the middle element
               int mid = start + (end - start) / 2;

               if (target < nums[mid]) {
                   end = mid - 1;
               } else if (target > nums[mid]) {
                   start = mid + 1;

               } else {
                   //potential answer is found
                   if (findStartIndex) {
                       end = mid - 1;
                   } else {
                       start = mid + 1;
                   }
               }
           }
               return ans;
    }
}