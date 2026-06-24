package ui;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.DashboardPage;
import pages.LoginPage;

public class UIValidationTest extends BaseTest {

    @Test
    public void verifyDashboardUIElements() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("Admin", "admin123");

        DashboardPage dashboardPage =
                new DashboardPage(driver);

        Assert.assertTrue(
                dashboardPage.isDashboardDisplayed(),
                "Dashboard Header is not displayed");

        Assert.assertTrue(
                dashboardPage.isUserDropdownDisplayed(),
                "User Dropdown is not displayed");
    }

    @Test
    public void verifyPageTitle() {

        String actualTitle = driver.getTitle();

        Assert.assertFalse(
                actualTitle.isEmpty(),
                "Page title is empty");
    }
}