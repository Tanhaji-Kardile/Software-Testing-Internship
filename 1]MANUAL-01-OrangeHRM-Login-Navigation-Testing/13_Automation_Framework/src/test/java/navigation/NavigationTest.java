package navigation;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class NavigationTest extends BaseTest {

    @Test
    public void verifyLeaveMenuNavigation() {

        test = extent.createTest("Verify Leave Menu Navigation");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123");

        test.info("Clicking Leave menu");

        driver.findElement(
                org.openqa.selenium.By.xpath("//span[text()='Leave']"))
                .click();

        String currentUrl = driver.getCurrentUrl();

        Assert.assertTrue(currentUrl.contains("leave"),
                "Leave module navigation failed");

        test.pass("Leave navigation successful");
    }

    @Test
    public void verifyPIMMenuNavigation() {

        test = extent.createTest("Verify PIM Menu Navigation");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123");

        test.info("Clicking PIM menu");

        driver.findElement(
                org.openqa.selenium.By.xpath("//span[text()='PIM']"))
                .click();

        String currentUrl = driver.getCurrentUrl();

        Assert.assertTrue(currentUrl.contains("pim"),
                "PIM module navigation failed");

        test.pass("PIM navigation successful");
    }
}