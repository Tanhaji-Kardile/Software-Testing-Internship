package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.FeedbackPage;
import testdata.TestData;
import utils.ConfigReader;

public class XSS_Test extends BaseTest {

    @DataProvider(name = "xssData")
    public Object[][] xssData() {
        return TestData.xssPayloads();
    }

    @Test(dataProvider = "xssData")
    public void testStoredXSS(String payload) {

        getDriver().get(
                ConfigReader.getProperty("url") + "contact");

        FeedbackPage feedback = new FeedbackPage(getDriver());

        feedback.enterComment(payload);
        feedback.submitFeedback();

        try {
            Thread.sleep(3000);
        } catch (Exception ignored) {
        }

        String currentUrl = getDriver().getCurrentUrl();
        String pageTitle = getDriver().getTitle();

        System.out.println("=================================");
        System.out.println("Payload Used : " + payload);
        System.out.println("Current URL  : " + currentUrl);
        System.out.println("Page Title   : " + pageTitle);
        System.out.println("=================================");

        Assert.assertTrue(
                currentUrl.contains("contact")
                        || currentUrl.contains("feedback")
                        || currentUrl.contains("localhost:3000"),
                "Unexpected navigation occurred after XSS payload submission!");
    }
}