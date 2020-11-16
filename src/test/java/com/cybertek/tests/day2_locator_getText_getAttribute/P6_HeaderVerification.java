package com.cybertek.tests.day2_locator_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_HeaderVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

        driver.manage().window().maximize();



        String expectedText = "Log in to ZeroBank";
        String actualText = driver.findElement(By.tagName("h3")).getText();

        if(actualText.equals(expectedText))
            System.out.println("Header Verification has PASSED");
        else System.out.println("Header Verification has FAILED");


    }
}
