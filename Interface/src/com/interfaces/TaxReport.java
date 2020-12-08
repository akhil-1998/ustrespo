package com.interfaces;

public class TaxReport {
    private TaxCalculator2020 calculator;

    public TaxReport(TaxCalculator2020 calculator) {
        calculator = calculator;

    }

    public void show(TaxCalculator2020 calculator) {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

//    public void show(){
//        var tax = calculator.calculateTax();
//        System.out.println(tax);
//
//    }

//    public void setCalculator(TaxCalculator2020 calculator) {
//        this.calculator = calculator;
//    }
}
