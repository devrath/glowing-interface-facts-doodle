package com.demo.reports;

import com.demo.concreteImpl.Developer;
import com.demo.interfaces.IntDeveloperInformation;
import com.demo.interfaces.IntDeveloperResponsibilities;

public class PrintReportFormat {

    private IntDeveloperResponsibilities responsibilities;
    private IntDeveloperInformation information;
    private StringBuilder builder;

    public PrintReportFormat(IntDeveloperResponsibilities responsibilities,
                             IntDeveloperInformation information) {
        this.responsibilities = responsibilities;
        this.information = information;
    }

    public void logCodeReviewFormat(){
        builder = new StringBuilder();
        System.out.println(builder.append("Developer named ").append(information.getName()).append(" ")
                .append("is performing the code review for").append(" ").append(responsibilities.performCodeReview()));
    }


    public void logTakeInterviewsFormat(){
        builder = new StringBuilder();
        System.out.println(builder.append("Developer named ").append(information.getName()).append(" ")
                .append("is is taking interviews for").append(" ").append(responsibilities.takeInterviews()));
    }


    public void logWriteCodeFormat(){
        builder = new StringBuilder();
        System.out.println(builder.append("Developer named ").append(information.getName()).append(" ")
                .append("is writing code for").append(" ").append(responsibilities.writeCode()));
    }


}
