package com.cybertek.tests.day9_windows_Tabs;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Alert3_Practice {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){

        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");


    }

    @Test
    public void p3_prompt_alert_practice() {

        WebElement promptAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        promptAlertButton.click();

        Alert alert = driver.switchTo().alert();

        BrowserUtils.wait(2);

        String input = "something is happening";
        alert.sendKeys(input);

        alert.accept();


        WebElement resultText =driver.findElement(By.id("result"));

        Assert.assertTrue(resultText.isDisplayed(),"The result is NOT displayed");

        String actual = resultText.getText();

        Assert.assertTrue(actual.contains(input),"The result DOES NOT contain the input.");




    }

}
