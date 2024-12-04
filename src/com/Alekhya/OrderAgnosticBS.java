package Alekhya;

import com.sun.source.tree.BreakTree;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 4, 6, 7, 9};
        int[] arr = {56,45,34,23,12,5,3,2,-1};
        int target = 2;
        int ans = orderAgnostic(arr, target);
        System.out.println(ans);
    }

    static int orderAgnostic(int[] arr, int target) {
        //find whether array is soreted or not
//        boolean isAsc;
        int start = 0;
        int end = arr.length - 1;

//        boolean isAsc;
//        if(arr[start] < arr[end])
//            isAsc = true;
//        else{
//            isAsc = false;
//        }

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }

        }
        return -1;
    }
}
