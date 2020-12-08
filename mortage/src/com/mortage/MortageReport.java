package com.mortage;

import java.text.NumberFormat;

public class MortageReport implements MortageReportInterface {
    private final NumberFormat currency;
    private MortageCalculator calculator;

    public MortageReport(MortageCalculator calculator){
        this.calculator = calculator;
        this.currency = NumberFormat.getCurrencyInstance();
    }

    @Override
    public void printMortage() {
        double mortgage = calculator.calculateMortage();
        String mortgageFormatted = currency.format(mortgage);
        System.out.println();
        System.out.println("Mortgage");
        System.out.println("_________");
        System.out.println("Monthly Payments: " + mortgageFormatted);

    }

    @Override
    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("Payment Schedule");
        System.out.println("________________");

        for(double balance: calculator.getRemainingBalance())
            System.out.println(currency.format(balance));

        }

    }

