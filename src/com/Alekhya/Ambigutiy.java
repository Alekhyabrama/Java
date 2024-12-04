package com.Alekhya;

import java.util.Arrays;

public class Ambigutiy {
    public static void main(String[] args) {
        //fun(); // if we wont tell is it int or string it is ambigutiy at complie time it wont know what to process next.

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void fun(String ...v) {
        System.out.println(Arrays.toString(v));

    }
}
