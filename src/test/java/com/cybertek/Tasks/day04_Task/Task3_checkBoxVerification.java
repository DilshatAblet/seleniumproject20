package com.cybertek.day04_Task;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Task3_checkBoxVerification {
    public static void main(String[] args) {


      //  TC	#2:	SeleniumEasy	CheckboxVerification–   Section	1
        // 1.Open	Chrome	browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // 2.Go	to	https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        // 3.Verify// “Success	–Check	box	is	checked”	message	is	NOTdisplayed.
        WebElement successCheckBox =driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        WebElement successMessage = driver.findElement(By.xpath("//div[@id='txtAge']"));


        if(!successMessage.isDisplayed()) System.out.println("Verification PASSED");
        else System.out.println("Verification FAILED");



        // 4.Click	to	checkbox	under	“Single	Checkbox	Demo”	section
        successCheckBox.click();
        // 5.Verify	“Success	–Check	box	is	checked”	message	isdisplayed.

        if(successCheckBox.isSelected()&&successMessage.isDisplayed())
            System.out.println("Success Message Verification Passed");
        else System.out.println("Success Message Verification Passed");



        // TC	#3:	SeleniumEasy	Checkbox	Verification	–  Section	2
        // 1.Open	Chrome	browser
        // 2.Go	to	https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        // 3.Verify	“Check	All”	button	text	is	“Check	All”
        // 4.Click	to	“Check	All”	button
        // 5.Verify	all	check	boxes	are	checked
        // 6.Verify	button	text	changed	to	“Uncheck all"





    }
}
