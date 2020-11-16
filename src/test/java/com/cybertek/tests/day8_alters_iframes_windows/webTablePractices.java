package com.cybertek.tests.day8_alters_iframes_windows;

import com.cybertek.utilities.SmartBearUtilities;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.cybertek.utilities.SmartBearUtilities.loginToSmartBear;

public class webTablePractices {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        loginToSmartBear(driver);
    }

    @Test
    public void test4_verify_order(){

        SmartBearUtilities.verifyOrder2(driver,"Mark Smith");

    }
    @Test
    public void name_city(){

        SmartBearUtilities.printNamesAndCities(driver);
    }








}
