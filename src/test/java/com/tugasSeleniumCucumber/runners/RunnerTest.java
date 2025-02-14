package com.tugasSeleniumCucumber.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/test/resources/features/login.feature",
        },
        glue = {
                "com.tugasSeleniumCucumber.hooks",
                "com.tugasSeleniumCucumber.steps",
        }
)
public class RunnerTest extends AbstractTestNGCucumberTests {
}
