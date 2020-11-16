package com.cybertek.Tasks.day02_task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        String expectedresult = "Facebook – log in or sign up";
        String actualresult = driver.getTitle();

        if(actualresult.equals(expectedresult))
            System.out.println("result passed!");
        else System.out.println("result failed!");



    }

}
