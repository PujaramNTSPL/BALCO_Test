package com.BALCO_Project.pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AnodeCathodeDistance {

    WebDriver driver;
    WebDriverWait wait;

    public AnodeCathodeDistance(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    // HANDLE SWEET ALERT POPUP
    public void handlePopup() {
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("swal2-container")));
        } catch (Exception e) {}
    }

    // ENTRY FORMS
    public void clickEntryForms() {
        handlePopup();
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[normalize-space()='Entry Forms']"))).click();
    }

    // PROCESS CONTROL
    public void clickProcessControl() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[normalize-space()='Process Control']"))).click();
    }

    // ACD FORM
    public void clickACD() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[normalize-space()='Anode Cathode Distance']"))).click();
    }

    // SELECT DATE
    public void selectDate() {

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//input[@placeholder='dd-mm-yyyy']"))).click();

        Select month = new Select(driver.findElement(By.xpath("//ngb-datepicker//select[1]")));
        month.selectByVisibleText("Jan");

        Select year = new Select(driver.findElement(By.xpath("//ngb-datepicker//select[2]")));
        year.selectByVisibleText("2026");

        driver.findElement(By.xpath("//ngb-datepicker//div[text()='9']")).click();
    }

    // SELECT SHIFT
    public void selectShift() {

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[normalize-space()='Select Shift Time']"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[normalize-space()='A (06:00 AM - 02:00 PM)']"))).click();
    }

    // SELECT PLANT
    public void selectPlant() {

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[normalize-space()='Select Plant']"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[normalize-space()='Plant - III']"))).click();
    }
    
    // SELECT ROOM
    public void selectRoom() {

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[contains(text(),'Select Room')]")))
        .click();

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[normalize-space()='3']")))
        .click();
    }
    
    //SELECT SECTION
    
    public void selectSection() {

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[contains(text(),'Select Section')]")))
        .click();

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[normalize-space()='1']")))
        .click();
    }
    
	 // SELECT MEASUREMENT TIME
	    public void selectMeasurementTime(String hour, String minute) {
	
	        // Click HH dropdown
	        wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("(//span[@class='dropdown-btn'])[5]")))
	                .click();
	
	        // Select Hour
	        wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//div[@class='dropdown-list']//div[normalize-space()='" + hour + "']")))
	                .click();
	
	        // Click MM dropdown
	        wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("(//span[@class='dropdown-btn'])[6]")))
	                .click();
	
	        // Select Minute
	        wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//div[@class='dropdown-list']//div[normalize-space()='" + minute + "']")))
	                .click();
	    }
	    
	 // SELECT POT NUMBER
	    public void selectPot(String potNo) {
	
	        wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("(//span[@class='dropdown-btn'])[7]")))
	                .click();
	
	        wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("(//div[normalize-space()='" + potNo + "'])[1]")))
	                .click();
	    }
	    
	 // ENTER ACD VALUE
	    public void enterACDValue(String value) {
	
	        wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("(//input[@placeholder='Enter ACD'])[1]")))
	                .sendKeys("15");
	    }
	    
	    
	
	    // SUBMIT FORM
	    public void submitForm() {
	
	        WebElement submitBtn = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(
	                        By.xpath("//button[normalize-space()='Submit']")));
	
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	
	        js.executeScript("arguments[0].scrollIntoView(true);", submitBtn);
	        js.executeScript("arguments[0].click();", submitBtn);
	        
	       
	    }
	}