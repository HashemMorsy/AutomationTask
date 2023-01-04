package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    public static WebDriver driver;

    @Before()
    public static void OpenBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get("https://demo.nopcommerce.com/");
    }

    @After
    public static void quitDriver() {
        driver.quit();
    }
}
