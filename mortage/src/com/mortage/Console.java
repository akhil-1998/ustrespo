package com.mortage;

import java.util.Scanner;

public class Console {
    private static Scanner sc1 = new Scanner(System.in);
    public static double readNumber(String prompt){
       return sc1.nextDouble();

    }
    public static double readNumber(String prompt,
                                    double min,
                                    double max) {
        //Scanner sc1 = new Scanner(System.in);
        double value;
        while (true) {
            System.out.println(prompt);
            value = sc1.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between" + min + "and" + max);
        }
        return value;
    }
}
