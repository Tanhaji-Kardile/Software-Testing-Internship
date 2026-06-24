package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeavePage {

    WebDriver driver;

    // Constructor
    public LeavePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By leaveMenu = By.xpath("//span[text()='Leave']");

    private By applyLeaveOption = By.xpath("//a[text()='Apply']");

    private By leaveTypeDropdown = By.xpath("//div[contains(@class,'oxd-select-text')]");

    private By fromDate = By.xpath("(//input[@placeholder='yyyy-dd-mm'])[1]");

    private By toDate = By.xpath("(//input[@placeholder='yyyy-dd-mm'])[2]");

    private By applyButton = By.xpath("//button[@type='submit']");

    // Actions
    public void clickLeaveMenu() {
        driver.findElement(leaveMenu).click();
    }

    public void clickApplyLeave() {
        driver.findElement(applyLeaveOption).click();
    }

    public void enterFromDate(String date) {
        driver.findElement(fromDate).sendKeys(date);
    }

    public void enterToDate(String date) {
        driver.findElement(toDate).sendKeys(date);
    }

    public void clickApplyButton() {
        driver.findElement(applyButton).click();
    }

    // Reusable Method
    public void applyLeave(String from, String to) {
        enterFromDate(from);
        enterToDate(to);
        clickApplyButton();
    }
}