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

    public void checkoutTest () {
        driver.get("https://www.saucedemo.com/cart.html");
        cartPage.clickCheckoutButton();
        checkoutStep1.fillFirstName("Budi");
        checkoutStep1.fillLastName("Setiawan");
        checkoutStep1.fillPostalCode("1234");
        checkoutStep1.clickContinueCheckoutButton();
        checkoutStep2.clickFinishCheckoutButton();
    }
}