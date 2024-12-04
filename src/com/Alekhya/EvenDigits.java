package Alekhya;

import com.sun.source.tree.BreakTree;

public class EvenDigits {
    public static void main(String[] args) {
        int[] num = {12,3,67,5,7,7865};
        System.out.println(findNumbers(num));
        System.out.println(digits(68));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums) {
            if(even(num)) {
                count++;
            }
        }
        return count;
    }


    static  boolean even(int num) {
            int numOfDigits = digits(num);
//                if(numOfDigits % 2 == 0){
//                    return true;
//                }
//                return false;
//        }
        return numOfDigits % 2 ==0;
    }

    static int digits(int num) {

        if(num < 0 ){
            num = num * -1;
        }

        if(num == 0) {
            return 1;
        }
        int count =0;
        while(num >0){
            count++;
            num = num/10;

        }
        return count;
    }

}
