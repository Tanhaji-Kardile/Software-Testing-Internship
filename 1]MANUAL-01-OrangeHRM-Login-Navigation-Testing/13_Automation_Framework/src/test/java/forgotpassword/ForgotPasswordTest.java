package forgotpassword;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class ForgotPasswordTest extends BaseTest {

    @Test
    public void verifyForgotPasswordFunctionality() {

        driver.get(
            "https://opensource-demo.orangehrmlive.com/web/index.php/auth/requestPasswordResetCode");

        Assert.assertTrue(
                driver.getCurrentUrl().contains("requestPasswordResetCode"),
                //driver.getCurrentUrl().contains("invalidPage"),  // fail test case
                "Forgot Password page not opened");
    }
}