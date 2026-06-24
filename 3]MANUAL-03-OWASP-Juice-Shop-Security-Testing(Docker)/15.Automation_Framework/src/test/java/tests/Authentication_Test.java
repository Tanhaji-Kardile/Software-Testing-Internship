package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import testdata.TestData;
import utils.ConfigReader;

public class Authentication_Test extends BaseTest {

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return TestData.loginData();
    }

    @Test(dataProvider = "loginData")
    public void testInvalidLoginAuthentication(String email, String password) {

        getDriver().get(
                ConfigReader.getProperty("url") + "login");

        LoginPage login = new LoginPage(getDriver());

        login.login(email, password);

        try {
            Thread.sleep(3000);
        } catch (Exception ignored) {
        }

        String pageSource =
                getDriver().getPageSource().toLowerCase();

        boolean loginFailed =
                pageSource.contains("invalid")
                        || pageSource.contains("incorrect")
                        || pageSource.contains("error")
                        || getDriver()
                        .getCurrentUrl()
                        .contains("login");

        Assert.assertTrue(
                loginFailed,
                "Authentication validation failed. Login behavior not as expected.");
    }
}