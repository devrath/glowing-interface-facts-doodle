package com.demo.report;

import com.demo.interfaces.TaxCalculator;

/** TaxReport class uses the tax calculator to calculate tax
 *  We want the TaxReport class not to be dependent on concrete representation of TaxCalculator
 *  Instead we want TaxReport class to be dependent on interface **/
public class TaxReport {

    private TaxCalculator taxCalculator;

    public TaxReport(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    public void show() {
        var tax = taxCalculator.calculateTax();
        System.out.println(tax);
    }

}
