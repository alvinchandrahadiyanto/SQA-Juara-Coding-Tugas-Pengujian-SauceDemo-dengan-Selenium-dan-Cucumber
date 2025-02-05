package com.tugasSeleniumCucumber.drivers.strategies;

import com.tugasSeleniumCucumber.drivers.managers.ChromeDriverManager;
import com.tugasSeleniumCucumber.drivers.managers.FirefoxDriverManager;
import com.tugasSeleniumCucumber.drivers.utils.BrowserType;
import org.openqa.selenium.WebDriver;

public class DriverStrategyImplementer implements IDriverStrategy {

    @Override
    public WebDriver setStrategy(String strategy) {
        switch (strategy) {
            case BrowserType.CHROME:
                return ChromeDriverManager.make();
            case BrowserType.FIREFOX:
                return FirefoxDriverManager.make();
            default:
                return ChromeDriverManager.make();

        }
    }
}