package com.tugasSeleniumCucumber.pages.checkout;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutComplete {
    private WebDriver driver;

    @Getter
    @FindBy(id = "back-to-products")
    WebElement thankYouElement;

    @FindBy(id = "back-to-products")
    WebElement backHome;

    public CheckoutComplete(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickBackHomeButton() {
        backHome.click();
    }

}
