package com.demo;

import com.demo.concreteImpl.Developer;
import com.demo.reports.PrintReportFormat;

public class Main {

    public static void main(String[] args) {
        var developer1 = new Developer("RAVI");
        var developer2 = new Developer("SMITHA");

        var report1 = new PrintReportFormat(developer1,developer1);
        var report2 = new PrintReportFormat(developer2,developer2);

        report1.logCodeReviewFormat();
        report2.logCodeReviewFormat();
        System.out.println("--------------------");
        report1.logTakeInterviewsFormat();
        report2.logTakeInterviewsFormat();
        System.out.println("--------------------");
        report1.logWriteCodeFormat();
        report2.logWriteCodeFormat();

    }
}
