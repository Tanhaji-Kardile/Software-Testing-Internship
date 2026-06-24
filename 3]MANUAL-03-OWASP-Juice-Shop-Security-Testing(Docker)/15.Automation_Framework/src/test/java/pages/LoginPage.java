package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    private By emailField = By.id("email");
    private By passwordField = By.id("password");
    private By loginButton = By.id("loginButton");

    // Welcome banner close button
    private By welcomeDismissButton =
            By.xpath("//button[@aria-label='Close Welcome Banner']");

    public void login(String email, String password) {

        try {

            WebElement closeBtn =
                    wait.until(ExpectedConditions
                            .elementToBeClickable(welcomeDismissButton));

            closeBtn.click();

            System.out.println("Welcome banner closed.");

        } catch (Exception e) {

            System.out.println("Welcome banner not displayed.");
        }

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(emailField));

        driver.findElement(emailField).clear();
        driver.findElement(emailField).sendKeys(email);

        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);

        WebElement loginBtn =
                wait.until(
                        ExpectedConditions.elementToBeClickable(loginButton));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", loginBtn);
    }
}