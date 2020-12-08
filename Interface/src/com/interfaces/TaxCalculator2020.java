package com.interfaces;

import java.util.Scanner;

public class TaxCalculator2020 {
    private double taxableIncome;

    public TaxCalculator2020(double taxableIncome){                     //constructor
        System.out.println("Initial amount: " + taxableIncome);
      this.taxableIncome = taxableIncome;
    }

    public TaxCalculator2020() {

    }

    public double calculateTax(){                                       //Tax Calculator
        this.taxableIncome = taxableIncome * 0.4;
        return this.taxableIncome;
    }

    public double calculateTax(int year){                               //method overloading
        double taxableIncomeForYears = (taxableIncome * 0.4) * year;
        return taxableIncomeForYears;
    }



    public void discount(){
        System.out.println("If you have an insurance input 1 else 0");
        Scanner scanner = new Scanner(System.in);
        byte i = scanner.nextByte();
        if(i == 1){
            System.out.println("You are eligible for 10% discount in tax amount");
            double temp = this.taxableIncome / 10;
            double total = this.taxableIncome - temp;
            System.out.println("Your payable Tax amount is " + total);

        } else{
            System.out.println("Your payable Tax amount is " + taxableIncome);
        }

    }

    public double getTaxableIncome() {                                      //getter
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {                    //setter
        this.taxableIncome = taxableIncome;
    }
}
