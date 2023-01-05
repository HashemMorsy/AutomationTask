package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import managers.FileReaderManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks {

    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @Before(value = "@smoke")
    public void OpenBrowser() {
        driver.set(new ChromeDriver());
        driver.get().manage().window().maximize();
        driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait()));
        driver.get().get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
    }

    @After
    public void quitDriver() {
        driver.get().quit();
    }
}