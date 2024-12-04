package Alekhya;

public class SearchInRange {
    public static void main(String[] args) {
            int[] arr = {18,12,16,4,3,7,8};
            int target = 3;
        System.out.println(linearSearch(arr, target,1,5));
    }
    static int linearSearch(int[] arr, int target, int start, int end) {
        if(arr.length == 0){
            return -1;
        }

        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if(element == target)
            {
                return index;
            }

        }
        return  -1;

    }
}
