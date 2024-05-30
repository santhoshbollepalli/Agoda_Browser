package com.agoda.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import java.time.Duration;

public class Baseclass {
    public static WebDriver driver;
    public static void openBrowser(){
        driver = new FirefoxDriver();
        driver.get("https://www.agoda.com/en-in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        System.out.println("Browser Opened");
        Reporter.log("Browser Opened");
    }
    public static void closeBroswer(){
        driver.quit();
        System.out.println("Browser closed");
        Reporter.log("Browser closed");
    }
}
