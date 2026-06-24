package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FeedbackPage {

    private WebDriver driver;

    public FeedbackPage(WebDriver driver) {
        this.driver = driver;
    }

    private By commentBox = By.cssSelector("textarea");
    private By ratingBox = By.cssSelector("#rating > input");
    private By submitButton = By.cssSelector("button[type='submit']");

    public void enterComment(String comment) {
        driver.findElement(commentBox).clear();
        driver.findElement(commentBox).sendKeys(comment);
    }

    public void submitFeedback() {

        // Enter rating
        WebElement rating = driver.findElement(ratingBox);
        rating.clear();
        rating.sendKeys("5");

        // Click submit
        WebElement submit = driver.findElement(submitButton);

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", submit);
    }
}