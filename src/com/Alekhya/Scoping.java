package com.Alekhya;

public class Scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 67;
        // c=34; // we cant use c outside
        String name = "com/Alekhya";
        {
            name = "Satya";
            a = 100;
            int c = 67;
            System.out.println(name);
            System.out.println(a);
        }
        System.out.println(a);
        System.out.println(name);
        ;
        for(int i=0; i < 5; i++) {

            System.out.println(i);
            int num =90;
         //   int a = 0; we can't re intialise a in loop again.



        }
    }

}

