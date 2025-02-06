package com.tugasSeleniumCucumber.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/test/resources/features/login.feature",
        },
        glue = {
                "jc.belajar.cucumber.definitions",
        }
)
public class RunnerTest extends AbstractTestNGCucumberTests {
}
