package com.cybertek.tests;

import com.cybertek.utilities.SmartBearUtilities;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WebTableTasks {

    WebDriver driver;


    @BeforeMethod
    public void setUpMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        SmartBearUtilities.loginToSmartBear(driver);




    }

    @Test
    public void p3_verify_susans_order_date(){

        WebElement susanDate = driver.findElement(By.xpath("//td[.='Susan McLaren']/following-sibling::td[3]"));

        String expectedDate ="01/05/2010";
        String actualDate = susanDate.getText();

        Assert.assertTrue(actualDate.equals(expectedDate),"Actual Date is not same");
        Assert.assertEquals(actualDate,expectedDate,"Actual date is not same");


    }














}
