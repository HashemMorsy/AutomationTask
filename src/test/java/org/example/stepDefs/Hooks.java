package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;

    @Before()
    public static void OpenBrowser() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/");
//        Thread.sleep(5000);

    }

    @After
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }


}
