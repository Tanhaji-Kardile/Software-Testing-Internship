
package com.gatling.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    public static ExtentReports getInstance(String reportName) {

        String reportPath =
                System.getProperty("user.dir")
                + "/extent-reports/"
                + reportName
                + ".html";

        ExtentSparkReporter spark =
                new ExtentSparkReporter(reportPath);

        spark.config().setReportName(reportName);

        spark.config().setDocumentTitle(
                "BlazeDemo Gatling Load Test Report");

        ExtentReports extent = new ExtentReports();

        extent.attachReporter(spark);

        extent.setSystemInfo(
                "Project",
                "Load Testing of BlazeDemo Flight Booking Application Using Gatling");

        extent.setSystemInfo(
                "Tool",
                "Gatling");

        extent.setSystemInfo(
                "Virtual Users",
                "20");

        extent.setSystemInfo(
                "Ramp-Up Duration",
                "30 Seconds");
        
        return extent;
    }
}

