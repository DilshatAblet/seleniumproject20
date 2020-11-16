package com.cybertek.Tasks;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TC_41 {




    @Test
    public void Dynamically_loaded(){

        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/1");
        WebElement Button = Driver.getDriver().findElement(By.xpath("//*[@id='start']/button"));
        Button.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),7);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[4]/div/button")));

        WebElement username = Driver.getDriver().findElement(By.id("username"));
        WebElement password = Driver.getDriver().findElement(By.id("pwd"));


        BrowserUtils.wait(2);
        username.sendKeys("tomsmith");
        password.sendKeys("incorrectpassword");

        BrowserUtils.wait(2);
        WebElement submit = Driver.getDriver().findElement(By.xpath("//div[4]/div/button"));
        submit.click();

        BrowserUtils.wait(2);


    }


}
