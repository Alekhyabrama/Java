package com.Alekhya;

import java.util.Arrays;

public class VarArga {
    public static void main(String[] args) {
      fun(2,3,4,6,7,8,9,1);
      fun1(2,4, "ali", "vkfvd");

    }

    static void fun(int ...v) { // its here declared like array v.
        System.out.println(Arrays.toString(v));
    }

    static void fun1(int a, int b, String ...v) {
        System.out.println("please print this");

}




}