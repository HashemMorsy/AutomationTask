package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class P03_login {

    private WebDriver driver;

    public P03_login(WebDriver driver)
    {
        this.driver = driver;
    }

    private static final By Email = By.id("Email");
    private static final By Password = By.id("Password");
    private static final By LoginButton = By.cssSelector("button[class=\"button-1 login-button\"]");

    public void setEmail(String E) {
        driver.findElement(Email).sendKeys(E);
    }

    public void setPassword(String P) {
        driver.findElement(Password).sendKeys(P);
    }

    public void clickLoginButton() {
        driver.findElement(LoginButton).click();
    }

}
