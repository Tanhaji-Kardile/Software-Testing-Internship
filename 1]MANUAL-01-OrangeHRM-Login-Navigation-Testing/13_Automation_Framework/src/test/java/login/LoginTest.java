package login;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.DashboardPage;
import pages.LoginPage;
import utils.ExcelReader;

public class LoginTest extends BaseTest {

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {

        ExcelReader excel = new ExcelReader(
                "src/test/resources/testdata.xlsx",
                "LoginData");

        return excel.getSheetData();
    }

    @Test(dataProvider = "loginData")
    public void verifyLogin(String username, String password) {

        test = extent.createTest("Verify Login Test");

        LoginPage loginPage = new LoginPage(driver);

        test.info("Entering username and password");
        loginPage.login(username, password);

        if (username.equals("Admin") && password.equals("admin123")) {

            DashboardPage dashboardPage = new DashboardPage(driver);

            boolean status = dashboardPage.isDashboardDisplayed();

            Assert.assertTrue(status, "Dashboard is not displayed");

            test.pass("Valid login successful - Dashboard displayed");
        } else {

            test.pass("Invalid login test executed successfully");
        }
    }
}