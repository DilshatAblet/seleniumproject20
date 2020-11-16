package com.cybertek.tests.day2_locator_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_googleTitleVarification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        String expectedResult = "Google";
        String actualResult = driver.getTitle();

        if(actualResult.equals(expectedResult))
            System.out.println("Title varification PASSED!");
        else System.out.println("Title varification FAILED!");








    }
}
