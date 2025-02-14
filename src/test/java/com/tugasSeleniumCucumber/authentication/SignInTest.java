package com.tugasSeleniumCucumber.authentication;

import com.tugasSeleniumCucumber.drivers.DriverSingleton;
import com.tugasSeleniumCucumber.drivers.utils.BrowserType;
import com.tugasSeleniumCucumber.pages.authentications.SignInPage;
import com.tugasSeleniumCucumber.pages.products.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SignInTest {
    private ProductsPage productsPage;
    private SignInPage signInPage;
    private WebDriver driver;

    public void setup() {
        driver = DriverSingleton.getDriver();
    }

    public void goToSignInPage() {

        signInPage = new SignInPage(driver);
    }
}