package com.interfaces;

import java.util.Scanner;

public class TaxDiscount {
     private TaxCalculator2020 taxCalculator2020 = new TaxCalculator2020();



    public void discount(){
        System.out.println("If you have an insurance input 1 else 0");
        Scanner scanner = new Scanner(System.in);
        byte i = scanner.nextByte();
        if(i == 1){
            System.out.println("You are eligible for 10% discount in tax amount");
            double temp = (taxCalculator2020.getTaxableIncome()) / 10;
            double total = (taxCalculator2020.getTaxableIncome()) - temp;
            System.out.println("Your payable Tax amount is " + total);

        } else{
            System.out.println("Your payable Tax amount is " + taxCalculator2020.getTaxableIncome());
        }

    }
}
