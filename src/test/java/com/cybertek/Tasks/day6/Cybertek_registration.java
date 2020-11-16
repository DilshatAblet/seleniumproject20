package com.cybertek.Tasks.day6;

import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Cybertek_registration {

    WebDriver driver;

    @Test
    public void Cybertek_registration_test(){

        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/registration_form");
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        WebElement fisrtName = driver.findElement(By.xpath("//*[@name='firstname']"));
        Faker faker = new Faker();
        fisrtName.sendKeys(faker.name().firstName());

        WebElement lastName = driver.findElement(By.xpath("//*[@name='lastname']"));
        lastName.sendKeys(faker.name().lastName());

        WebElement userName = driver.findElement(By.xpath("//*[@name='username']"));
        userName.sendKeys(faker.name().firstName()+faker.name().lastName());

        WebElement email = driver.findElement(By.xpath("//*[@name='email']"));
        email.sendKeys(faker.name().username()+"@gmail.com");

        WebElement password = driver.findElement(By.xpath("//*[@name='password']"));
        password.sendKeys(faker.name().username());

        WebElement phoneNumber = driver.findElement(By.xpath("//*[@name='phone']"));
        phoneNumber.sendKeys(faker.phoneNumber().phoneNumber());

        WebElement gender = driver.findElement(By.xpath("//*[@value='male']"));
        gender.click();

        WebElement DOB = driver.findElement(By.xpath("//*[@name='birthday']"));
        DOB.sendKeys("12/03/1980");

        Select select = new Select(driver.findElement(By.xpath("//*[@name='department']")));
        select.selectByVisibleText("Department of Engineering");

        Select select1 = new Select(driver.findElement(By.xpath("//*[@name='job_title']")));
        select1.selectByVisibleText("SDET");

        WebElement language = driver.findElement(By.xpath("//*[@id='inlineCheckbox2']"));
        language.click();

        WebElement sign = driver.findElement(By.xpath("//*[@id='wooden_spoon']"));
        sign.click();

        WebElement signupMessage = driver.findElement(By.xpath("//*[@class='alert alert-success']"));

        Assert.assertTrue(signupMessage.isDisplayed(),"registration verification FAILED");





    }

}
