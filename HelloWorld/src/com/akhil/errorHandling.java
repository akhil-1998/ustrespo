package com.akhil;

public class errorHandling {
    public static void main(String[] agrs){
        //int number = 1.1;
        //System.out.println(name);
        printNumber(10);
        System.out.println("Finish");
    }
    public static void printNumber(int limit){
        for(int i = 0; i < limit; i+=2){
            System.out.println(i);
        }
    }
}
