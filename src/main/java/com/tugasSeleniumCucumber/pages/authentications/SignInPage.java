package com.tugasSeleniumCucumber.pages.authentications;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
    private String baseURL = "https://www.saucedemo.com/";
    private WebDriver driver;

    @FindBy(id = "user-name")
    WebElement usernameElement;

    @FindBy(id = "password")
    WebElement passwordElement;

    @FindBy(xpath = "//input[@id='login-button']")
    WebElement buttonSignInElement;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openPage() {
        driver.get(baseURL);
    }

    public void fillUsername(String username) {
        usernameElement.sendKeys(username);
    }

    public void fillPassword(String password) {
        passwordElement.sendKeys(password);
    }

    public void clickLoginButton() {
        buttonSignInElement.click();
    }

    public void loginActivity(String username, String password) {
        fillUsername(username);
        fillPassword(password);
        clickLoginButton();
    }
}