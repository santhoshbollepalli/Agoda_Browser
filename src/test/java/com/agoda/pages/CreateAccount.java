package com.agoda.pages;

import com.agoda.utility.Baseclass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import static com.agoda.utility.Baseclass.driver;


public class CreateAccount extends Baseclass {
    static By btn_createaccount = By.xpath("//*[@id=\"page-header\"]/section/div[2]/div[1]/div[1]/div[1]/button/div/div/span");
    static By txt_firstname = By.xpath("//input[@id='firstName']");
    static By txt_lastname = By.xpath("//input[@id='lastName']");
    static By txt_email = By.xpath("//input[@id='email']");
    static By txt_password = By.xpath("//input[@id='password']");
    static By txt_confirmpassword = By.xpath("//input[@id='confirmPassword']");
    static By checkbox_agreeterms = By.xpath("//span[@class='sc-fznZeY dzZFTs sc-fzoKki cxVrpv']");
    static By btn_signup = By.xpath("//button[@id='email-signup-button']//div[@class='sc-fzoiQi jkvegZ']");

    //Functionality
    public static void Createacc() throws Exception{
//        Alert ale = driver.switchTo().alert();
//        System.out.println(ale.getText());
//        ale.dismiss();
        driver.findElement(By.xpath("/html/body/div[13]/div[2]/div[3]/button[2]")).click();
        WebElement crtbtn = driver.findElement(btn_createaccount);
        crtbtn.clear();
        crtbtn.click();
        Thread.sleep(3000);
        driver.findElement(txt_firstname).sendKeys("Bollepalli");
        Thread.sleep(3000);
        driver.findElement(txt_lastname).sendKeys("Santhosh");
        Thread.sleep(3000);
        driver.findElement(txt_email).sendKeys("santhosh.b567@gmail.com");
        Thread.sleep(3000);
        driver.findElement(txt_password).sendKeys("Santhosh@123");
        Thread.sleep(3000);
        driver.findElement(txt_confirmpassword).sendKeys("Santhosh@123");
        Thread.sleep(3000);
        driver.findElement(checkbox_agreeterms).click();
        Thread.sleep(3000);
        driver.findElement(btn_signup).click();
        Thread.sleep(3000);
        System.out.println("Signup Successful");
        Reporter.log("Singup into account");
    }

}
