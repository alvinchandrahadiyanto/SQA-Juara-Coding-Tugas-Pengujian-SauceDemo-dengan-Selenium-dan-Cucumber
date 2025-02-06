package com.tugasSeleniumCucumber.checkout;

import com.tugasSeleniumCucumber.pages.checkout.*;
import com.tugasSeleniumCucumber.pages.products.CartPage;
import com.tugasSeleniumCucumber.pages.products.ProductsPage;
import org.openqa.selenium.WebDriver;

public class CheckoutTest {
    private CheckoutStep1Page checkoutStep1;
    private CheckoutStep2Page checkoutStep2;
    private CartPage cartPage;
    private WebDriver driver;

    public void checkoutTest (String firstName, String lastName, String postalCode) {
        driver.get("https://www.saucedemo.com/cart.html");
        cartPage.clickCheckoutButton();
        checkoutStep1.fillFirstName(firstName);
        checkoutStep1.fillLastName(lastName);
        checkoutStep1.fillPostalCode(postalCode);
        checkoutStep1.clickContinueCheckoutButton();
        checkoutStep2.clickFinishCheckoutButton();
    }
}