package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

    WebDriver driver;

    // Constructor
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By dashboardHeader = By.xpath("//h6[text()='Dashboard']");
    private By userDropdown = By.xpath("//span[@class='oxd-userdropdown-tab']");

    // Verification Methods
    public boolean isDashboardDisplayed() {
        return driver.findElement(dashboardHeader).isDisplayed();
    }

    public boolean isUserDropdownDisplayed() {
        return driver.findElement(userDropdown).isDisplayed();
    }

    // Page Information
    public String getPageTitle() {
        return driver.getTitle();
    }
}