package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @Before(value = "@smoke")
    public void OpenBrowser() {
        driver.set(new ChromeDriver());
        driver.get().manage().window().maximize();
        driver.get().get("https://demo.nopcommerce.com/");
    }

    @After
    public void quitDriver() {
        driver.get().quit();
    }
}
