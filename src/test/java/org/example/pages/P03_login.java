package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;


public class P03_login {

    private static final By Email = By.id("Email");
    private static final By Password = By.id("Password");
    private static final By LoginButton = By.cssSelector("button[class=\"button-1 login-button\"]");

    public void setEmail(String E) {
        Hooks.driver.findElement(Email).sendKeys(E);
    }

    public void setPassword(String P) {
        Hooks.driver.findElement(Password).sendKeys(P);
    }

    public void clickLoginButton() {
        Hooks.driver.findElement(LoginButton).click();
    }

}
