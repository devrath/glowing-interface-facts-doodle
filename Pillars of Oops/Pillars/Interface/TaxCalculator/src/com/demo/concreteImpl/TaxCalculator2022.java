package com.demo.concreteImpl;

import com.demo.interfaces.TaxCalculator;

public class TaxCalculator2022 implements TaxCalculator {

    // Taxable Income
    private double taxableIncome;

    public TaxCalculator2022(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    /**
     * Calculate Tax
     * @return taxableIncome
     */
    @Override
    public double calculateTax() {
        // 30% Tax
        return taxableIncome * 0.4;
    }

}
