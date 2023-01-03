package org.example.testRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        features = "src/main/resources/features",
        glue = {"org/example/stepDefs"},
        tags = "@smoke"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}