package com.cybertek.Tasks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Jira_task_no5 {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){

        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com/stream/?login=yes");
        driver.findElement(By.name("USER_LOGIN")).sendKeys("helpdesk2@cybertekschool.com");
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");
        driver.findElement(By.xpath("//div/input[@value='Log In']")).click();

    }

    @Test
    public void Btrix(){


    }





}
