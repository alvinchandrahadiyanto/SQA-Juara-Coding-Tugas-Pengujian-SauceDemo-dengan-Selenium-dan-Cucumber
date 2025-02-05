package com.tugasSeleniumCucumber.pages.products;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    private WebDriver driver;

    @FindBy(id = "continue-shopping")
    WebElement continueShopping;

    @FindBy(id = "checkout")
    WebElement checkout;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickContinueShoppingButton() {
        continueShopping.click();
    }

    public void clickCheckoutButton() {
        checkout.click();
    }
}