package com.cybertek.tests.day1_slenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumTest {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        String URL = driver.getCurrentUrl();
        String Title = driver.getTitle();

        // shortCut = Varieble.soutv

        System.out.println("URL = " + URL);
        System.out.println("Title = " + Title);

        Thread.sleep(1000);

        driver.navigate().back();

        Thread.sleep(1000);

        driver.navigate().forward();

        Thread.sleep(1000);

        driver.navigate().refresh();

        Thread.sleep(1000);
        driver.navigate().to("https://www.facebook.com");

        String pagesource = driver.getPageSource();

        System.out.println("pagesource = " + pagesource);

        driver.close();

        driver.quit();



    }
}
