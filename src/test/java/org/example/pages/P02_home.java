package org.example.pages;

import io.qameta.allure.Step;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;

public class P02_home {

    private WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    public WebElement registerButton()
    {
        return driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));
    }
    By loginLink = By.className("ico-login");
    By logoutLink = By.cssSelector("a[class=\"ico-logout\"]");
    By myAccountTab = By.cssSelector("a[class=\"ico-account\"]") ;
    By ErrorMessage = By.cssSelector("div[class=\"message-error validation-summary-errors\"]");

    @Step("user navigate to register page")
    public void clickRegisterLink ()
    {
        registerButton() .click();
        //
        wait.until(ExpectedConditions.visibilityOfElementLocated(P01_register.getFirstname()));

    }
    public void clickLoginLink ()
    {
        driver .findElement(loginLink ) .click();
    }
    public void clickLogoutLink ()
    {
        driver .findElement(logoutLink ) .click();
    }
    public WebElement MyAccountTab()
    {
        return driver .findElement(myAccountTab);
    }
    public WebElement loginButton()
    {
        return driver .findElement(loginLink);
    }

    public String getErrorMessage ()
    {
        return driver.findElement(ErrorMessage).getText();
    }

}
