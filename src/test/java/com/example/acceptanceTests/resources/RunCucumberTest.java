package com.example.acceptanceTests.resources;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/example/acceptanceTests/resources/features",
        stepNotifications = true,
        glue =  "com.example.acceptanceTests.resources",
        plugin = {"pretty", "html:target/cucumber-report.html"}
)
public class RunCucumberTest {
}