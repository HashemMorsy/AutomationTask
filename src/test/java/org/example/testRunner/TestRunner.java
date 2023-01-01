package org.example.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-html-report",},
        features = "src/main/resources/features",
        glue = {"org/example/stepDefs"},
        tags = "@smoke"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}