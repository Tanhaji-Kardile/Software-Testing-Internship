package listeners;

import base.BaseTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.ScreenshotUtil;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {

        System.out.println("▶ Test Started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        System.out.println("✔ Test Passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {

        System.out.println("✖ Test Failed: " + result.getName());

        try {

            BaseTest baseTest =
                    (BaseTest) result.getInstance();

            String path =
                    ScreenshotUtil.captureScreenshot(
                            baseTest.getDriver(),
                            result.getName());

            System.out.println(
                    "📸 Screenshot saved at: " + path);

        } catch (Exception e) {

            System.out.println(
                    "Screenshot capture failed: "
                            + e.getMessage());
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {

        System.out.println(
                "⏭ Test Skipped: "
                        + result.getName());
    }

    @Override
    public void onFinish(ITestContext context) {

        System.out.println(
                "🏁 Test Suite Finished");
    }
}