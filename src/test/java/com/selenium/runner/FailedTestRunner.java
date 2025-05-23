package com.selenium.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/return.txt",
        glue = "com/project/step_definitions"
)


public class FailedTestRunner {
}
