package com.akhil;

import java.util.Scanner;

public class MortageRefactor {

    public static double readNumber(String prompt,
                                    double min,
                                    double max) {
        Scanner sc1 = new Scanner(System.in);
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
