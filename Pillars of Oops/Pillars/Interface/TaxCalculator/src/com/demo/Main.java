package com.demo;

public class Main {
    public static void main(String[] args) {
        var taxableIncome = 100_000;

	    var taxCalculator2021 = new TaxCalculator2021(taxableIncome);
        var taxCalculator2022 = new TaxCalculator2022(taxableIncome);

        var report2021 = new TaxReport(taxCalculator2021);
        var report2022 = new TaxReport(taxCalculator2022);

        report2021.show();
        report2022.show();

    }
}
