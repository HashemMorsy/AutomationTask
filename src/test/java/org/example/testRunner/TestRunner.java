package org.example.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        features = "src/test/resources/features",
        glue = {"org/example/stepDefs"},
        tags = "@smoke"
)
public class TestRunner extends AbstractTestNGCucumberTests {

    // to run scenarios in parallel
    /*
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

     */
}