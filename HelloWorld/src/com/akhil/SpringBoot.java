package com.akhil;

import java.util.Scanner;

public class SpringBoot {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner scanner1 = new Scanner(System.in);
        byte number = scanner1.nextByte();

        if (number % 5 == 0)
            System.out.println("Spring");
        else if (number % 3 == 0)
            System.out.println("Boot");
        else
            System.out.println(number);
    }
}
