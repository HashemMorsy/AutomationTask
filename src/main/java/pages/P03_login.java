package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class P03_login {

    private final WebDriver driver;

    public P03_login(WebDriver driver)
    {
        this.driver = driver;
    }

    private static final By email = By.id("Email");
    private static final By password = By.id("Password");
    private static final By loginButton = By.cssSelector("button[class=\"button-1 login-button\"]");

    public void setEmail(String E) {
        driver.findElement(email).sendKeys(E);
    }

    public void setPassword(String P) {
        driver.findElement(password).sendKeys(P);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

}
