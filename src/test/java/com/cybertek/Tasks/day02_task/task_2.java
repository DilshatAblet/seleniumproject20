package com.cybertek.Tasks.day02_task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task_2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        driver.findElement(By.id("email")).sendKeys("dilxat856988@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("dilshat"+ Keys.ENTER);

        System.out.println(driver.getTitle());

        String expectedTitle = "Log in to Facebook | Facebook";
        String actualTitle = driver.getTitle();


        if(actualTitle.equals(expectedTitle))
            System.out.println("Title Verification Passed");
        else  System.out.println("Title Verification Failed");




    }
}
