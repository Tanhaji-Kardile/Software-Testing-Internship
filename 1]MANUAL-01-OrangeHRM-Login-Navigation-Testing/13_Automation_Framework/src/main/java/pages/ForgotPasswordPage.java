package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    WebDriver driver;

    // Constructor
    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By lnkForgotPassword =
            By.xpath("//a[contains(@href,'requestPasswordResetCode')]");

    private By txtUsername =
            By.name("username");

    private By btnResetPassword =
            By.xpath("//button[@type='submit']");

    private By btnCancel =
            By.xpath("//button[@type='button']");

    // Actions
    public void clickForgotPasswordLink() {
        driver.findElement(lnkForgotPassword).click();
    }

    public void enterUsername(String username) {
        driver.findElement(txtUsername).sendKeys(username);
    }

    public void clickResetPasswordButton() {
        driver.findElement(btnResetPassword).click();
    }

    public void clickCancelButton() {
        driver.findElement(btnCancel).click();
    }

    // Reusable Method
    public void resetPassword(String username) {
        enterUsername(username);
        clickResetPasswordButton();
    }
}