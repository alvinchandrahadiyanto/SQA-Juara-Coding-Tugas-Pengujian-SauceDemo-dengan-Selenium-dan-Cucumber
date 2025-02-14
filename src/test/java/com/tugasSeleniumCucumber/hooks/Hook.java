package com.tugasSeleniumCucumber.hooks;

import java.net.MalformedURLException;

import com.tugasSeleniumCucumber.drivers.DriverSingleton;
import com.tugasSeleniumCucumber.drivers.utils.BrowserType;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class Hook {
    @BeforeAll
    public static void initialize() throws MalformedURLException {
        DriverSingleton.getDriver(BrowserType.CHROME);
    }

    @AfterAll
    public static void finalTeardown() {
        DriverSingleton.quitDriver();
    }
}
