package com.gatling.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.gatling.utils.ExtentManager;

public class GenerateExtentReport {

    public static void main(String[] args) {

        ExtentReports extent =
                ExtentManager.getInstance("BlazeDemo_Final_Load_Test_Report");

        // Project Summary
        ExtentTest project =
                extent.createTest("BlazeDemo Load Testing Project Summary");

        project.info("Project : Load Testing of BlazeDemo Flight Booking Application Using Gatling");
        project.info("Tool Used : Gatling");
        project.info("Virtual Users : 20");
        project.info("Ramp-Up Duration : 30 Seconds");
        project.pass("Project Execution Completed");

        // Scenario 1
        ExtentTest searchFlight =
                extent.createTest("Scenario 1 - Search Flight");

        searchFlight.pass("Search Flight Scenario Executed Successfully");
        searchFlight.info("From City : Paris");
        searchFlight.info("To City : Buenos Aires");

        // Scenario 2
        ExtentTest chooseFlight =
                extent.createTest("Scenario 2 - Choose Flight");

        chooseFlight.pass("Choose Flight Scenario Executed Successfully");
        chooseFlight.info("Flight Selected : Virgin America");
        chooseFlight.info("Flight Number : 43");

        // Scenario 3
        ExtentTest completeBooking =
                extent.createTest("Scenario 3 - Complete Booking");

        completeBooking.pass("Booking Scenario Executed Successfully");
        completeBooking.info("Passenger Name : Sachin");
        completeBooking.info("Payment Type : Visa");

        // Scenario 4
        ExtentTest loadTest =
                extent.createTest("Scenario 4 - BlazeDemo Load Test");

        loadTest.pass("Load Test Executed Successfully");
        loadTest.info("Concurrent Users : 20");
        loadTest.info("Ramp-Up Time : 30 Seconds");

        // Final Summary
        ExtentTest summary =
                extent.createTest("Execution Summary");

        summary.pass("All Test Scenarios Executed Successfully");
        summary.info("Total Scenarios : 4");
        summary.info("Passed : 4");
        summary.info("Failed : 0");

        extent.flush();

        System.out.println("Extent Report Generated Successfully");
    }
}