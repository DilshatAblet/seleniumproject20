package com.cybertek.tests.day2_locator_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5_EtsyTitleVerification {

public static void main(String[] args) {

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.etsy.com");
    driver.manage().window().maximize();

    driver.findElement(By.id("global-enhancements-search-query")).sendKeys("wooden spoon"+ Keys.ENTER);

    String expectedTitle = "Wooden spoon | Etsy AU";
    String actualTitle = driver.getTitle();

    if(actualTitle.equals(expectedTitle))
        System.out.println("Title Verification Passed");
    else System.out.println("Title Verification Failed");











    }
}
