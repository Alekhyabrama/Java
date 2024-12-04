package com.Alekhya;

public class IfElse {
    public static void main(String[] args) {
        int salary = 3400;
//        if(salary<=3400) {
//            salary = salary +1000;
//        }
//        else{
//            salary = salary+2000;
//        }
//        System.out.println(salary);
//    }
        if(salary > 10000) {
            salary += 2000;
        }else if(salary > 20000) {
            salary +=1000;
        }else {
            salary +=3000;
        }
        System.out.println(salary);
        }
}
