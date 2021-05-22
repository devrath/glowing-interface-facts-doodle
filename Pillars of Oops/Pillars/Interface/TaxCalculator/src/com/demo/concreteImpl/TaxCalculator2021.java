package com.demo.concreteImpl;

import com.demo.interfaces.TaxCalculator;

/** This class is used to calculate the tax **/
public class TaxCalculator2021 implements TaxCalculator {

    // Taxable Income
    private double taxableIncome;

    public TaxCalculator2021(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    /**
     * Calculate Tax
     * @return taxableIncome
     */
    @Override
    public double calculateTax() {
        // 30% Tax
        return taxableIncome * 0.3;
    }


}
