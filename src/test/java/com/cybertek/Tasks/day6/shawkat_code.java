package com.cybertek.Tasks.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class dat {


    public static void verifyOrder(WebDriver driver, String name){
        List<WebElement> listOfNames = driver.findElements(By.xpath("//div/table//*/td[2]"));
        boolean nameIsListed = false;
        for(WebElement eachElement : listOfNames){
            if(name.equals(eachElement.getText())){
                nameIsListed = true;
                break;
            }
        }

        Assert.assertTrue(nameIsListed,"Name is not in order list!");
    }
}
