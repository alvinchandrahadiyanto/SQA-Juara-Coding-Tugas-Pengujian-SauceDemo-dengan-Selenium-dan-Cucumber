package com.tugasSeleniumCucumber.pages.checkout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStep2Page {
    private WebDriver driver;

    @FindBy(id = "finish")
    WebElement finishCheckout;

    @FindBy(id = "cancel")
    WebElement cancelCheckout2;

    public CheckoutStep2Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}