package com.cybertek.tests.day3_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WT_CybertekLinkVerification {
    public static void main(String[] args) {

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

       // driver.findElement(By.name("email")).sendKeys("anyemsil@domain.com");

        WebElement emailInputbox = driver.findElement((By.name("email")));
        emailInputbox.sendKeys("anyemsil@domain.com");

        WebElement retrievePasswordutton = driver.findElement(By.id("form_submit"));
        retrievePasswordutton.click();


       // driver.findElement(By.id("form_submit")).click();

        String expectedInURL ="email_sent";
        String actualURL = driver.getCurrentUrl();

        if(actualURL.contains(expectedInURL)) System.out.println("URL verification PASSED!");
        else System.out.println("URL verification FAILED!");

        WebElement confirmationMessage = driver.findElement(By.name("confirmation_message"));

        String actualText = confirmationMessage.getText();

        String expectedText = "Your e-mail's been sent!";


        if(actualText.equals(expectedText))
            System.out.println("Header text verification PASSED!");
        else System.out.println("Header text verification FAILED!");

        if(confirmationMessage.isDisplayed()){
            System.out.println("Confirmation message is displayed.Verification PASSED!");
        }else{
            System.out.println("Confirmation message is NOT displayed.Verification FAILED!");
        }





    }
}
