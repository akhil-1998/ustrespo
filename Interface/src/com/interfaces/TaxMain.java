package com.interfaces;

public class TaxMain {
    public static void main(String[] args) {

        TaxCalculator2020 taxCalculator = new TaxCalculator2020(600000);
        taxCalculator.calculateTax();
        System.out.println("Your payable Tax amount for 5 years is " + taxCalculator.calculateTax(5));
        System.out.println("Your payable Tax amount is " + taxCalculator.getTaxableIncome());
        taxCalculator.discount();
        taxCalculator.setTaxableIncome(700000);


        }
    }

