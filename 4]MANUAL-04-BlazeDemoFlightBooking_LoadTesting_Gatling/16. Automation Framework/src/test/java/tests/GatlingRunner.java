package com.gatling.tests;

import io.gatling.app.Gatling;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.gatling.utils.ExtentManager;

public class GatlingRunner {

    public static void main(String[] args) {

        ExtentReports extent =
                ExtentManager.getInstance("BlazeDemoCompleteExecutionReport");

        // =====================================================
        // Scenario 1 - Search Flight
        // =====================================================

        ExtentTest searchTest =
                extent.createTest("Scenario 1 - Search Flight");

        try {

            Gatling.main(new String[] {
                    "-s", "com.gatling.tests.SearchFlightSimulation",
                    "-rf", "target"
            });

            searchTest.pass("Search Flight Scenario Executed Successfully");

        } catch (Exception e) {

            searchTest.fail(e);
        }

        // =====================================================
        // Scenario 2 - Choose Flight
        // =====================================================

        ExtentTest chooseTest =
                extent.createTest("Scenario 2 - Choose Flight");

        try {

            Gatling.main(new String[] {
                    "-s", "com.gatling.tests.ChooseFlightSimulation",
                    "-rf", "target"
            });

            chooseTest.pass("Choose Flight Scenario Executed Successfully");

        } catch (Exception e) {

            chooseTest.fail(e);
        }

        // =====================================================
        // Scenario 3 - Complete Booking
        // =====================================================

        ExtentTest bookingTest =
                extent.createTest("Scenario 3 - Complete Booking");

        try {

            Gatling.main(new String[] {
                    "-s", "com.gatling.tests.CompleteBookingSimulation",
                    "-rf", "target"
            });

            bookingTest.pass("Complete Booking Scenario Executed Successfully");

        } catch (Exception e) {

            bookingTest.fail(e);
        }

        // =====================================================
        // Scenario 4 - Master Load Test
        // =====================================================

        ExtentTest loadTest =
                extent.createTest("Scenario 4 - BlazeDemo Load Test");

        try {

            Gatling.main(new String[] {
                    "-s", "com.gatling.tests.BlazeDemoLoadTest",
                    "-rf", "target"
            });

            loadTest.pass("BlazeDemo Load Test Executed Successfully");

        } catch (Exception e) {

            loadTest.fail(e);
        }

        extent.flush();

        System.out.println("All Scenarios Executed Successfully");
    }
}

