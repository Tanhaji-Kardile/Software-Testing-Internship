package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {

    public static ExtentReports getReportObject() {

        String path = System.getProperty("user.dir") + "/reports/ExtentReport.html";

        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("OWASP Security Test Report");
        reporter.config().setDocumentTitle("Automation Results");

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);

        extent.setSystemInfo("Tester", "Automation User");
        extent.setSystemInfo("Environment", "QA");

        return extent;
    }
}