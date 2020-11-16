package com.cybertek.VyTrack;


import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VehicleCost {

    WebDriver driver;

    @BeforeMethod
    public void setUPMethod() throws InterruptedException {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://qa2.vytrack.com/user/login");

        WebElement usernameInput = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        highLighterMethod(driver,usernameInput);
        Thread.sleep(2000);
        usernameInput.sendKeys("user151");
        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        highLighterMethod(driver,passwordInput);
        Thread.sleep(2000);
        passwordInput.sendKeys("UserUser123"+ Keys.ENTER);

    }
    @Test
    public void vehicleCostPageCreateAndCancel() throws InterruptedException {

        driver.findElement(By.xpath("//span[@class='title title-level-1']")).click();
        Thread.sleep(2000);
        WebElement vehicleCostButton = driver.findElement(By.xpath("//span[.='Vehicle Costs']"));
        highLighterMethod(driver, vehicleCostButton);
        Thread.sleep(2000);
        vehicleCostButton.click();



        //locate "create vehicle cost" button:
        Thread.sleep(6000);
        WebElement createButton = driver.findElement(By.xpath("//a[@class='btn main-group btn-primary pull-right ']"));
        highLighterMethod(driver,createButton);
        Thread.sleep(4000);
        createButton.click();

        //locate types of cost:
        WebElement typeSelector = driver.findElement(By.xpath("//span[@class='select2-chosen']"));
        typeSelector.click();

        driver.findElement(By.xpath("//div[.='Vehicle Insurance']")).click();

        //locate total price:
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='custom_entity_type[TotalPrice]']")).sendKeys("1350");


        //Date:
        Thread.sleep(4000);
        WebElement dateSelection = driver.findElement(By.xpath("//input[@placeholder='Choose a date']"));
        dateSelection.click();


        //locate "today" button:

        Thread.sleep(1000);
        WebElement todayButton = driver.findElement(By.xpath("//button[@data-handler='today']"));
        todayButton.click();

        //cost Description
        Thread.sleep(1000);
        driver.findElement(By.xpath("//textarea[@name='custom_entity_type[CostDescriptions]']")).sendKeys("It's comprehensive insurance");

        //cancel:
        WebElement cancelButton = driver.findElement(By.xpath("//a[@data-action='cancel']"));
        highLighterMethod(driver,cancelButton);
        Thread.sleep(5000);
        cancelButton.click();

    }



    public void highLighterMethod(WebDriver driver, WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'background: red; border: 2px yellow;');", element);
    }


}
