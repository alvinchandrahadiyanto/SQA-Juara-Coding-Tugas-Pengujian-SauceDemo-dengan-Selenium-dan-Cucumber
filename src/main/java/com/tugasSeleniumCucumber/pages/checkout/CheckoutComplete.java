package com.tugasSeleniumCucumber.pages.checkout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutComplete {
    private WebDriver driver;

    @FindBy(id = "back-to-products")
    WebElement backHome;

    public CheckoutComplete(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
