package com.akhil;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgateCalOne {
    public static void main(String[] args) {
        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;


        Scanner sc1 = new Scanner(System.in);

        while (true) {

            System.out.println("Enter Prinical amount:");
            principal = sc1.nextInt();
            if(principal >=1000 && principal <= 1000000)
                break;
            System.out.println("Enter a value between 1000 and 1000000");
        }
        while(true) {
            System.out.println("Enter Annual Interest Rate:");
            float annualInterest = sc1.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30){
             monthlyInterest = annualInterest / PERCENT / MONTH_IN_YEAR;
            break;
        }
        System.out.println("Enter a value between 1 and 30");
        }

        while(true) {
            System.out.println("Enter Period (years):");
            byte years = sc1.nextByte();
            if (years >= 1 && years <= 30){
                numberOfPayments = years * MONTH_IN_YEAR;
            break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        double mortgage = principal *
                (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
