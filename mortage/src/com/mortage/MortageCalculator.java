package com.mortage;

public class MortageCalculator implements MortageCalculatorInterface {
    private final static byte PERCENT = 100;
    private final static byte MONTH_IN_YEAR = 12;
    private int principal;
    private float annualInterest;
    private byte years;

    public MortageCalculator(int principal,
                             float annualInterest,
                             byte years){
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;

    }


    @Override
    public  double calculateMortage() {
        float monthlyInterest = getAnnualInterest();
        int numberOfPayments = getNumberOfPayments();

        double mortgage = principal *
                (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortgage;
    }

    @Override
    public  double calculateBalance(
            short numberOfPaymentsMade) {

        float monthlyInterest = getAnnualInterest();
        int numberOfPayments = getNumberOfPayments();

        double balance = principal *
                (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade)) /
                (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;

    }

    @Override
    public double[] getRemainingBalance(){
        var balances = new double[getNumberOfPayments()];
        for (short month = 1; month <= balances.length; month++){
            balances[month - 1] = calculateBalance(month);
        }
        return balances;
    }

    private  int getNumberOfPayments() {
        return years * MONTH_IN_YEAR;
    }

    private  float getAnnualInterest() {
        return annualInterest / PERCENT / MONTH_IN_YEAR;
    }

}
