package com.Alekhya;

public class PassByValue {
    public static void main(String[] args) {
        String name = "com/Alekhya";
        greet(name);
    }

    static  void greet(String naam) {
        System.out.println(naam);
    }
}
