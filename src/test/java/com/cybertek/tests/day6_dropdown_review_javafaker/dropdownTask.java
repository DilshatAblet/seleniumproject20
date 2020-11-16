package com.cybertek.tests.day6_dropdown_review_javafaker;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class dropdownTask {

    WebDriver driver;

//    @AfterMethod
//    public void closeWindow(){
//        driver.close();
//    }

    @BeforeMethod
    public void setupMethod(){

    driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://practice.cybertekschool.com/dropdown");

    }
    @Test
    public void test2_verify_state_dropdown() throws InterruptedException {

    Select stateDropdown = new Select( driver.findElement(By.xpath("//select[@id='state']")));
    Thread.sleep(1000);
    stateDropdown.selectByVisibleText("Illinois");

    Thread.sleep(1000);
    stateDropdown.selectByValue("VA");

    Thread.sleep(1000);
    stateDropdown.selectByIndex(5);

    String expectedResult = "California";
    String actualResult = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualResult,expectedResult,"Actual VS expected is NOT equal");



    }

    @Test
    public void test3_date_dropdown_verification(){

        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        String expectedYear = "1921";
        String expectedMonth = "December";
        String expectedDay = "1";

        yearDropdown.selectByVisibleText("1921");
        monthDropdown.selectByValue("11");
        dayDropdown.selectByIndex(0);

        String actualYear = yearDropdown.getFirstSelectedOption().getText();
        String actualmonth = monthDropdown.getFirstSelectedOption().getText();
        String actualDay = dayDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualYear,expectedYear,"Actual Year VS expected year NOT equal");
        Assert.assertEquals(actualmonth,expectedMonth,"Actual Month VS expected Month NOT equal");
        Assert.assertEquals(actualDay,expectedDay,"Actual Day VS expected Day NOT equal");

    }


    @Test
    public void test4_date_dropdown_verification() throws InterruptedException {

    Select multipleSelectDropdown = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
    List<WebElement> allOptions = multipleSelectDropdown.getOptions();

    for(WebElement eachOption : allOptions){
        Thread.sleep(500);
        eachOption.click();
        System.out.println("Selected: "+eachOption.getText());
        Assert.assertTrue(eachOption.isSelected(),"the option: "+eachOption.getText()+
                " is Not selected!");


    }

    multipleSelectDropdown.deselectAll();

    for(WebElement eachOption : allOptions){
        Assert.assertFalse(eachOption.isSelected());
    }


    }

    @Test
    public void test5_html_dropdown_handling(){
        WebElement websiteDropdown = driver.findElement(By.xpath("//div[@class='dropdown']/a"));

        websiteDropdown.click();
        WebElement facebookLink = driver.findElement(By.xpath("//a[.='Facebook']"));
        facebookLink.click();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Facebook – log in or sign up";

        Assert.assertEquals(actualTitle,expectedTitle,"Title is NOT the same");

    }























}
