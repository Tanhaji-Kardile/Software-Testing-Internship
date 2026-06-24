package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By menuButton = By.cssSelector("button[aria-label='Open Sidenav']");
    private By accountButton = By.id("navbarAccount");
    private By searchBox = By.id("searchQuery");

    public boolean isHomePageDisplayed() {
        return driver.getTitle().toLowerCase().contains("juice");
    }

    public void openMenu() {
        driver.findElement(menuButton).click();
    }

    public void openAccount() {
        driver.findElement(accountButton).click();
    }

    public void searchItem(String keyword) {
        driver.findElement(searchBox).clear();
        driver.findElement(searchBox).sendKeys(keyword);
    }
}