package com.cybertek.Tasks.day5;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class dropdown {
    public static void main(String[] args) {
//        TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
//        1. Open Chrome browser
//        2. Go to http://practice.cybertekschool.com/dropdown
//        3. Verify “Simple dropdown” default selected value is correct
//        Expected: “Please select an option”
//        4. Verify “State selection” default selected value is correct
//        Expected: “Select a State”

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();

        Select simpleDropdown = new Select(driver.findElement(By.id("dropdown")));
        String expectedResult = "Please select an option";

        Assert.assertEquals(simpleDropdown, expectedResult, "Passed!");


    }



    }
