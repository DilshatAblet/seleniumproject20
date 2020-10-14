package com.cybertek.day04_Task;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Task1_AppleWebsite {
    public static void main(String[] args) {
//        1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
//        2.Go to https://www.apple.com
        driver.get("https://www.apple.com");
//        Click to iPhone
        int missingLinkText = 0;
        int LinkHasText = 0;
        WebElement iphoneLink = driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']"));
        iphoneLink.click();
//        4.Print out the texts of all links
        List<WebElement> allLink = driver.findElements(By.xpath("//body//a"));
        for (WebElement eachLink : allLink){
            System.out.println(eachLink.getText());
            if(eachLink.getText().isEmpty()) missingLinkText++;
            else LinkHasText++;
        }

//        5.Print out how many link is missing text

//        6.Print out how many link has text
//        7.Print out how many total link
        System.out.println("Number of Link missing: "+missingLinkText);
        System.out.println("Number of Link has Text: "+LinkHasText);
        System.out.println("Number of Total Link: "+allLink.size());








    }
}
