package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class vytrack_login_Page {

    public vytrack_login_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "prependedInput")
    public WebElement userName;

    @FindBy(id = "prependedInput2")
    public WebElement passWord;

    @FindBy(id = "_submit")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id='login-form']/fieldset/div[1]/div")
    public WebElement WrongPasswordText;

    @FindBy(linkText = "Forgot your password?")
    public WebElement forgotPassword;

    @FindBy(id = "prependedInput")
    public WebElement ForgotUserName;

    @FindBy(xpath = "//div[1]/form/fieldset/div/button")
    public WebElement RequestButton;

    @FindBy(id = "prependedInput")
    public WebElement ErrorMessage;



    public void vytrackLogin(String username,String password){
        userName.sendKeys(username);
        passWord.sendKeys(password);
        loginButton.click();

    }








}
