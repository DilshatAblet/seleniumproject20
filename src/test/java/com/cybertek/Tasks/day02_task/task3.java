package com.cybertek.day02_task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task3 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement homeLink = driver.findElement(By.xpath("/html/body/nav/ul/li/a"));
        if(homeLink.isDisplayed()) System.out.println("Home link is displayed");
        else System.out.println("Home link is NOT displayed");

        WebElement ForgotpPassword = driver.findElement(By.cssSelector("#content > div > h2"));
        if (ForgotpPassword.isDisplayed()) System.out.println("Forgot Password is displyed");
        else System.out.println("Forgot Password is Not displayed");

        WebElement Email = driver.findElement(By.xpath("//*[@id=\"forgot_password\"]/div/div/label"));
        if(Email.isDisplayed()) System.out.println("Email is Displayed!");
        else System.out.println("Email is Not displayed");

        WebElement EmailInputBox = driver.findElement(By.cssSelector("#forgot_password > div > div > input[type=text]"));
        if(EmailInputBox.isDisplayed()) System.out.println("Email Input Box is Displayed");
        else System.out.println("Email input Box is Not Displayed");

        WebElement RetrievePassword = driver.findElement(By.xpath("//*[@id=\"form_submit\"]/i"));
        if(RetrievePassword.isDisplayed()) System.out.println("Retrieve Password Button is Displayed");
        else System.out.println("Retrieve Password Button is Not displayed");

        WebElement PoweredByText = driver.findElement(By.cssSelector("#page-footer > div > div"));
        if(PoweredByText.isDisplayed()) System.out.println("Powered By Text is Displayed");
        else System.out.println("Powered By Text is NOT displayed");





    }
}
