package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class SmartBearUtilities {


    public static void loginToSmartBear(WebDriver driver) {

        WebElement userNameInput = driver.findElement(By.id("ctl00_MainContent_username"));
        userNameInput.sendKeys("Tester");

        WebElement passwordInput = driver.findElement(By.id("ctl00_MainContent_password"));
        passwordInput.sendKeys("test");

        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();


    }


    public static void verifyOrder(WebDriver driver, String name) {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        loginToSmartBear(driver);

        int index = 2;
        ArrayList<String> allNames = new ArrayList<String>();

        for (int i = 1; i < 9; i++) {
            String actualName = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[" + index + "]/td[2]")).getText();
            allNames.add(actualName);
            index++;
        }
        int countTrue = 0;
        boolean isExist = false;
        for (String eachName : allNames) {
            if (eachName.equals(name)) countTrue++;
            if (countTrue > 0) isExist = true;
        }
        Assert.assertTrue(isExist, name + " is NOT in the List!");
    }

    public static void verifyOrder2(WebDriver driver, String name) {

        List<WebElement> namesList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));
        for (WebElement each : namesList) {
            if (name.equals(each.getText())) {
                Assert.assertTrue(true);
                return;
            }
        }
        Assert.fail("Name does not exist in the List");

    }


    public static void printNamesAndCities(WebDriver driver) {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        loginToSmartBear(driver);

        List<WebElement> namesList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));
        List<WebElement> citiesList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[7]"));

        for (int i = 0; i < namesList.size(); i++) {
            System.out.println("Name" + (i + 1) + ": " + namesList.get(i).getText() + ", City" + (i + 1) + ": " + citiesList.get(i).getText());
        }


    }

}


