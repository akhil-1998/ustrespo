package com.mortage;

public class Main {

    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal :", 1000, 1000000);
        float annualInterest = (float) Console.readNumber("Annual Interest :", 1, 30);
        byte years = (byte) Console.readNumber("Period(Years) :", 1, 30);
        //Mortage Calculator Interface
        MortageCalculatorInterface mortageCalculatorInterface = new MortageCalculator(principal,annualInterest, years);
        
        //Mortage Report Interface
        MortageReportInterface mortageReportInterface = new MortageReport((MortageCalculator) mortageCalculatorInterface);

        mortageReportInterface.printMortage();
        mortageReportInterface.printPaymentSchedule();


    }


}
