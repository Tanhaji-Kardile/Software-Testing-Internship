package base;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utils.ConfigReader;
import utils.ExtentReportManager;

public class BaseTest {

    protected WebDriver driver;

    protected static ExtentReports extent;
    protected ExtentTest test;

    @BeforeSuite
    public void startReport() {

        extent = ExtentReportManager.getReportObject();
    }

    @BeforeMethod
    public void setUp() {

        driver = DriverFactory.initDriver(
                ConfigReader.getProperty("browser"));

        driver.manage().window().maximize();

        driver.get(
                ConfigReader.getProperty("url"));
    }

    @AfterMethod
    public void tearDown(ITestResult result) {

        test = extent.createTest(
                result.getMethod().getMethodName());

        if (result.getStatus() == ITestResult.SUCCESS) {

            test.pass("Test Passed");

        } else if (result.getStatus() == ITestResult.FAILURE) {

            test.fail(result.getThrowable());

        } else {

            test.skip("Test Skipped");
        }

        if (driver != null) {

            driver.quit();
        }
    }

    @AfterSuite
    public void endReport() {

        if (extent != null) {

            extent.flush();
        }
    }

    public WebDriver getDriver() {

        return driver;
    }
}