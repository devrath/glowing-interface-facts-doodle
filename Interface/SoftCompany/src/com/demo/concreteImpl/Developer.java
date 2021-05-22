package com.demo.concreteImpl;

import com.demo.interfaces.IntDeveloperInformation;
import com.demo.interfaces.IntDeveloperResponsibilities;

public class Developer implements IntDeveloperResponsibilities, IntDeveloperInformation {

    private String name;

    public Developer(String name) {
        this.name = name;
    }

    @Override
    public String performCodeReview() {
        int noOfHoursPerDay = 2;
        return noOfHoursPerDay + " " + "Hrs";
    }

    @Override
    public String takeInterviews() {
        int noOfHoursPerDay = 2;
        return noOfHoursPerDay + " " + "Hrs";
    }

    @Override
    public String writeCode() {
        int noOfHoursPerDay = 4;
        return noOfHoursPerDay + " " + "Hrs";
    }


    @Override
    public String getName() {
        return name;
    }
}
