package com.cybertek.Tasks;

import com.cybertek.pages.vytrack_login_Page;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class vytrack_Task35 {

    @Test
    public void TC35_vytrack_forgot_Password(){

        Driver.getDriver().get(ConfigurationReader.getProperty("vytrackURL"));

        vytrack_login_Page vytrackLoginPage = new vytrack_login_Page();

        vytrackLoginPage.forgotPassword.click();

        BrowserUtils.wait(2);

        Assert.assertEquals(Driver.getDriver().getTitle(),"Forgot Password","Verification failed");

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://qa3.vytrack.com/user/reset-request","Verification failed");

    }


    @Test
    public void TC36_Vytrack_forgot_password_pageverification(){

        Driver.getDriver().get(ConfigurationReader.getProperty("vytrackURL"));

        vytrack_login_Page vytrackLoginPage = new vytrack_login_Page();

        vytrackLoginPage.forgotPassword.click();

        BrowserUtils.wait(2);

        vytrackLoginPage.ForgotUserName.sendKeys(ConfigurationReader.getProperty("vytrackForgotUserName"));

        vytrackLoginPage.RequestButton.click();

        BrowserUtils.wait(2);

        Assert.assertTrue(vytrackLoginPage.ErrorMessage.isDisplayed(),"Verification Failed");



    }







}
