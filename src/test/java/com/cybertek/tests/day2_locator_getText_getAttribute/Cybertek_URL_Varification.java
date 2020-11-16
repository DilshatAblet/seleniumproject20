package com.cybertek.tests.day2_locator_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cybertek_URL_Varification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com");

        String expectedURL ="cybertekschool";

        String actualRusult = driver.getCurrentUrl();

        if(actualRusult.contains(expectedURL))
            System.out.println("URL Varification PASSED");
        else System.out.println("URL Varification FAILED");


        if(driver.getTitle().equals("Practice"))
            System.out.println("Title Varification PASSED");
        else System.out.println("Title Varification FAILED");





    }
}
