package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utils.ConfigReader;
import utils.ScreenshotUtils;
import utils.ExtentReportManager;

public class BaseTest {

    protected WebDriver driver;
    protected ConfigReader config;

    protected static ExtentReports extent;
    protected ExtentTest test;

    @BeforeSuite
    public void startReport() {
        extent = ExtentReportManager.getReportObject();
    }

    @BeforeMethod
    public void setup() {

        config = new ConfigReader();

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(10));

        driver.get(config.getUrl());
    }

    @AfterMethod
    public void tearDown(ITestResult result) {

        String testName = result.getName();

        // ✅ EXTENT REPORT LOGGING
        test = extent.createTest(testName);

        if (result.getStatus() == ITestResult.SUCCESS) {

            test.pass("Test Passed");

            ScreenshotUtils.captureScreenshot(
                    driver,
                    testName,
                    "Passed");
        }

        else if (result.getStatus() == ITestResult.FAILURE) {

            test.fail(result.getThrowable());

            ScreenshotUtils.captureScreenshot(
                    driver,
                    testName,
                    "Failed");
        }

        else if (result.getStatus() == ITestResult.SKIP) {
            test.skip("Test Skipped");
        }

        if (driver != null) {
            driver.quit();
        }
    }

    @AfterSuite
    public void endReport() {
        extent.flush();
    }
}