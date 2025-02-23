package com.tugasSeleniumCucumber.pages.products;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ProductsPage {
    private WebDriver driver;

    @FindBy(xpath = "//div[@class='app_logo']")
    private WebElement welcomeHeadingElement;

    @FindBy(xpath = "//*[@id=\\\"shopping_cart_container\\")
    private WebElement shoppingCart;

    private WebDriverWait wait;

    @FindBy(xpath = "//div[@class='inventory_item_name ']")
    private List<WebElement> listProduct;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
//        driver.findElements(By.xpath("//div[@class='inventory_item_name ']"));
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        PageFactory.initElements(driver, this);
    }

    public void waitForWelcomeHeadingElement() {
        By locator = By.xpath("//div[@class='app_logo']");
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public String getTextWelocmeHeadingElement() {
        waitForWelcomeHeadingElement();
        return welcomeHeadingElement.getText();
    }

    private void logout(){
        // step logout id=react-burger-menu-btn, logout_sidebar_link
        driver.findElement(By.id("react-burger-menu-btn")).click();
        driver.findElement(By.linkText("Logout")).click();
    }

    public void clickAllAddToCartButtons() {
        List<WebElement> addToCartButtons = driver.findElements(By.xpath("//button[contains(@id,'add-to-cart-')]"));
        for (WebElement button : addToCartButtons) {
            button.click();
        }
    }

    public void goToCartPage() {
        shoppingCart.click();
    }
}
