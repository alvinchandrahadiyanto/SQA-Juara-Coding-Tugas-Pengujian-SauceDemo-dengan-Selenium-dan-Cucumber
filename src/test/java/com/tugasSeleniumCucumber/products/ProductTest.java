package com.tugasSeleniumCucumber.products;

import com.tugasSeleniumCucumber.pages.products.ProductsPage;
import org.openqa.selenium.WebDriver;

public class ProductTest {
    private ProductsPage productsPage;
    private WebDriver driver;

    public void clickAllAddToCartTest () {
        driver.get("https://www.saucedemo.com/inventory.html");
        productsPage.clickAllAddToCartButtons();
    }
}
