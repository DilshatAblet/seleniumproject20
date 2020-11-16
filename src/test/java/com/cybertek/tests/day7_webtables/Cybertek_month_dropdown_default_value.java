package com.cybertek.tests.day7_webtables;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Cybertek_month_dropdown_default_value {

    WebDriver driver;

    @Test
    public void month_dropdown(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

        Select MonthOption = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        String actualValue = MonthOption.getFirstSelectedOption().getText();
        String expectedValue = LocalDateTime.now().getMonth().name();

        Assert.assertEquals(actualValue.toLowerCase(),expectedValue.toLowerCase(),expectedValue+" is NOT selected");

        // Task #8

        ArrayList<String> allMonths = new ArrayList();
        allMonths.addAll(Arrays.asList("January","February","March","April","May","June",
                "July","August","September","October","November","December"));
        for(int i = 0 ;i<12;i++){
            String eachMonths = driver.findElement(By.xpath("//select[@id='month']/option["+(i+1)+"]")).getText();
            Assert.assertEquals(allMonths.get(i),eachMonths,"Months are NOT same");

        }

    }






}
