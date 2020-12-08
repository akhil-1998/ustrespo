package com.interfaces;

public class Main {

    public static void main(String[] args) {
	 var calculator2020 = new TaxCalculator2020(50000);
	 var report = new TaxReport(calculator2020);

//	 report.setCalculator(calculator2020);
//	 report.show();


    }
}
