package com.BALCO_Project.pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    // Constructor
    public LoginPage(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    // Locators
    private By username = By.name("email");
    private By password = By.name("password");
    private By loginbtn = By.cssSelector(".btn.btn-primary");

    // Methods
    public void enterUsername(String user) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(username)).sendKeys("1020");
    }

    public void enterPassword(String pass) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys("Ntspl@2023");
    }

    public void clickLoginBtn() {

        wait.until(ExpectedConditions.elementToBeClickable(loginbtn)).click();
    }
}