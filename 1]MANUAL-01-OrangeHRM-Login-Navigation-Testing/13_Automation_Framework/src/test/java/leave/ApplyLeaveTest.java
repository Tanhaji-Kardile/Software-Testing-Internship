package leave;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LeavePage;
import pages.LoginPage;

public class ApplyLeaveTest extends BaseTest {

    @Test
    public void verifyApplyLeave() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("Admin", "admin123");

        LeavePage leavePage = new LeavePage(driver);

        leavePage.clickLeaveMenu();

        leavePage.clickApplyLeave();

        Assert.assertTrue(
                driver.getCurrentUrl().contains("applyLeave"),
                "Apply Leave page not opened");
    }
}