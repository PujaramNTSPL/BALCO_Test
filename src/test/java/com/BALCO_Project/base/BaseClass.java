package com.BALCO_Project.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    public static WebDriver driver;

    public static void initializeDriver() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://192.168.1.35:4900/login");
    }
}