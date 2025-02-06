package com.tugasSeleniumCucumber.definitions;

import com.tugasSeleniumCucumber.authentication.SignInTest;
import com.tugasSeleniumCucumber.pages.authentications.SignInPage;
import com.tugasSeleniumCucumber.pages.products.ProductsPage;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginDefinition {
    private SignInTest signTest;
    private SignInPage signInPage;
    private ProductsPage productsPage;

    @ParameterType(".*") // Mencocokkan semua teks
    public String stringValue(String arg) {
        return arg.substring(1, arg.length() - 1); // Menghapus tanda kutip
    }

    @Given("I am on the login page")
    public void goToSignInPage(){
        signTest.setup();
        signTest.goToSignInPage();
    }

    @When("I enter username {stringValue}")
    public void enterUsername(String username){
        signInPage.fillUsername(username);
    }

    @And("I enter password {stringValue}")
    public void enterPassword(String password){
        signInPage.fillPassword(password);
    }

    @Then("I succesfully login and get {stringValue}")
    public void successfullyLogin(String expectedWelcome){
        String textWelcome = productsPage.getTextWelocmeHeadingElement();
        Assert.assertEquals(textWelcome, expectedWelcome);
    }
}