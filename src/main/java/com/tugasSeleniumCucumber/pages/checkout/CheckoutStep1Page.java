package com.tugasSeleniumCucumber.pages.checkout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStep1Page {
    private WebDriver driver;

    @FindBy(id = "first-name")
    WebElement firstNameElement;

    @FindBy(id = "last-name")
    WebElement lastNameElement;

    @FindBy(id = "postal-code")
    WebElement postalCodeElement;

    @FindBy(id = "cancel")
    WebElement cancelCheckout1;

    @FindBy(id = "continue")
    WebElement continueCheckout;

    public CheckoutStep1Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillFirstName(String firstName) {
        firstNameElement.sendKeys(firstName);
    }

    public void fillLastName(String lastName) {
        lastNameElement.sendKeys(lastName);
    }

    public void fillPostalCode(String postalCode) {
        postalCodeElement.sendKeys(postalCode);
    }
}
