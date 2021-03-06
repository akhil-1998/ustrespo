package com.akhil;

import java.text.NumberFormat;

public class Mortage {
    final static byte MONTH_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal :", 1000, 1000000);
        float annualInterest = (float) Console.readNumber("Annual Interest :", 1, 30);
        byte years = (byte) Console.readNumber("Period(Years) :", 1, 30);

        printMortage(principal, annualInterest, years );
        printPaymentSchedule(principal, annualInterest, years);

    }

    public static void printMortage(int principal,
                                    float annualInterest,
                                    byte years) {
        double mortgage = calculateMortage(principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("Mortgage");
        System.out.println("_________");
        System.out.println("Monthly Payments: " + mortgageFormatted);

    }

    public static double calculateMortage(int principal,
                                          float annualInterest,
                                          byte years) {
        float monthlyInterest = annualInterest / PERCENT / MONTH_IN_YEAR;
        int numberOfPayments = years * MONTH_IN_YEAR;

        double mortgage = principal *
                (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortgage;
    }

    public static void printPaymentSchedule(int principal,
                                            float annualInterest,
                                            byte years) {
        System.out.println();
        System.out.println("Payment Schedule");
        System.out.println("________________");
        for (short month = 1; month <= years * MONTH_IN_YEAR; month++) {
            double balance = calculateBalance(principal, annualInterest, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));

        }

    }

    public static double calculateBalance(int principal,
                                          float annualInterest,
                                          byte years,
                                          short numberOfPaymentsMade) {

        float monthlyInterest = annualInterest / PERCENT / MONTH_IN_YEAR;
        int numberOfPayments = years * MONTH_IN_YEAR;

        double balance = principal *
                (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest,numberOfPaymentsMade)) /
                (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;

    }


}
