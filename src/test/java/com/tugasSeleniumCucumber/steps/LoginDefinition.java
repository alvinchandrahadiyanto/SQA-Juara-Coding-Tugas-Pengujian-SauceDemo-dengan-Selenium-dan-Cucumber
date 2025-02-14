package com.tugasSeleniumCucumber.steps;

import com.tugasSeleniumCucumber.authentication.SignInTest;
import com.tugasSeleniumCucumber.drivers.DriverSingleton;
import com.tugasSeleniumCucumber.pages.authentications.SignInPage;
import com.tugasSeleniumCucumber.pages.products.ProductsPage;
import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginDefinition {
    private SignInTest signTest;
    private SignInPage signInPage;
    private ProductsPage productsPage;
    private WebDriver driver;

    @ParameterType(".*") // Mencocokkan semua teks
    public String stringValue(String arg) {
        return arg.substring(1, arg.length() - 1); // Menghapus tanda kutip
    }

    @Before()
    public void setup() {
        driver = DriverSingleton.getDriver();
        signInPage = new SignInPage(driver);
        productsPage = new ProductsPage(driver);
    }

    @Given("I am on the login page")
    public void goToSignInPage(){
        signInPage.openPage();
    }

    @When("I enter username {stringValue}")
    public void enterUsername(String username){
        signInPage.fillUsername(username);
    }

    @And("I enter password {stringValue}")
    public void enterPassword(String password){
        signInPage.fillPassword(password);
    }

    @And("I click login button")
    public void clickLogin(){
        signInPage.clickLoginButton();
    }

    @Then("I succesfully login and get {stringValue}")
    public void successfullyLogin(String expectedWelcome){
        String textWelcome = productsPage.getTextWelocmeHeadingElement();
        Assert.assertEquals(textWelcome, expectedWelcome);
    }
}