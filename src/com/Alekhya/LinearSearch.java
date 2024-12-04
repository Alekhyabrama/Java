package Alekhya;


public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 6, 7, };
        int req = 6;
        //boolean ans = Linear2(nums, req);
        int ans1 = Linear(nums, req);
        int ans = Linear3(nums, req);
        System.out.println("this tells element is there or not in our array: " + ans);
        System.out.println("This is index valueof the element: " + ans1);

    }

    static int Linear3(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        //run the loop
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
            return Integer.MAX_VALUE;
        }

        // return true or false
    static boolean  Linear2(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        //run the loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return true;
            }
        }
        return false;
    }


    static int Linear(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        //run the loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
            return -1;
    }
}
