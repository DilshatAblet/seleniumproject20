package com.cybertek.Tasks;

import com.cybertek.pages.vytrack_login_Page;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC30_Vytrack {


    @Test
    public void WrongPasswordTest(){

        Driver.getDriver().get(ConfigurationReader.getProperty("vytrackURL"));

        vytrack_login_Page vytrackLoginPage = new vytrack_login_Page();

        vytrackLoginPage.vytrackLogin(ConfigurationReader.getProperty("vytrackUsername"),ConfigurationReader.getProperty("vytrackWrongPassword"));

        Assert.assertTrue(vytrackLoginPage.WrongPasswordText.isDisplayed(),"Verification failed!");

    }

    @Test
    public void TC31_Wrong_UserName_Test(){

        Driver.getDriver().get(ConfigurationReader.getProperty("vytrackURL"));

        vytrack_login_Page vytrackLoginPage = new vytrack_login_Page();

        vytrackLoginPage.vytrackLogin(ConfigurationReader.getProperty("vytrackWrongUsername"),ConfigurationReader.getProperty("vytrackPassword"));

        Assert.assertTrue(vytrackLoginPage.WrongPasswordText.isDisplayed(),"Verification failed!");



    }


    @Test
    public void TC32_Sales_Manager_Test(){

        Driver.getDriver().get(ConfigurationReader.getProperty("vytrackURL"));

        vytrack_login_Page vytrackLoginPage = new vytrack_login_Page();

        vytrackLoginPage.vytrackLogin(ConfigurationReader.getProperty("vytrackUsername"),ConfigurationReader.getProperty("vytrackPassword"));

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.titleIs("Dashboard"));

        Assert.assertEquals(Driver.getDriver().getTitle(),"Dashboard","Verification Failed!");



    }





}






