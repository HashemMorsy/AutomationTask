package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P02_home {

    private WebDriver driver;

    public P02_home(WebDriver driver)
    {
        this.driver = driver;
    }

    public WebElement registerButton() {
        return driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));
    }

    private static final By
            loginLink = By.className("ico-login");
    private static final By
            logoutLink = By.cssSelector("a[class=\"ico-logout\"]");
    private static final By
            myAccountTab = By.cssSelector("a[class=\"ico-account\"]");
    private static final By
            ErrorMessage = By.cssSelector("div[class=\"message-error validation-summary-errors\"]");

    public void clickRegisterLink() {
        registerButton().click();
    }

    public void clickLoginLink() {
        driver.findElement(loginLink).click();
    }

    public void clickLogoutLink() {
        driver.findElement(logoutLink).click();
    }

    public WebElement MyAccountTab() {
        return driver.findElement(myAccountTab);
    }

    public WebElement loginButton() {
        return driver.findElement(loginLink);
    }

    public String getErrorMessage() {
        return driver.findElement(ErrorMessage).getText();
    }

}