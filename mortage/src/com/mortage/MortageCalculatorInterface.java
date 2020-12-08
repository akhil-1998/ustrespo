package com.mortage;

public interface MortageCalculatorInterface {
    double calculateMortage();

    double calculateBalance(
            short numberOfPaymentsMade);

    double[] getRemainingBalance();
}
