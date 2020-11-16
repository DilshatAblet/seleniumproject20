package com.cybertek.tests.day2_locator_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationAndTitleVarification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.findElement(By.linkText("Gmail")).click();

        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedTitle))
            System.out.println("Gmail Title Verification PASSED");
        else System.out.println("Gmail Title Verification FAILED");

        driver.navigate().back();

        String expectedGoogleTitle = "Google";
        String actualGoogleTitle = driver.getTitle();


        if(actualGoogleTitle.equals(expectedGoogleTitle))
            System.out.println("Google Title verification PASSED ");
        else System.out.println("Google Title verification FAILED");



    }
}
