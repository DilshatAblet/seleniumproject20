package com.cybertek.Tasks.day6;

import com.cybertek.utilities.SmartBearUtilities;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SmartBear_task4 {

    WebDriver driver;

    @Test
    public void NamesAndCities(){
        SmartBearUtilities.verifyOrder(driver,"Paul Brown");


    }

    @Test
    public void smartBear(){
        SmartBearUtilities.printNamesAndCities(driver);
    }













    @Test
    public void testing_shawkat(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartBearUtilities.loginToSmartBear(driver);
        shawkat_code.verifyOrder(driver,"dilshat");
    }

}
