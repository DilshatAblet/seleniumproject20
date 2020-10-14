package com.cybertek.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SmartBear_task4 {

    WebDriver driver;

    @Test
    public void VerifyName(){
        SmartBearUtilities.verifyOrder(driver,"Mark Smith");


    }

    @Test
    public void smart(){
        SmartBearUtilities.printNamesAndCities(driver);
    }


}
