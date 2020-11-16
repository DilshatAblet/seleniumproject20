package com.cybertek.tests.day6_dropdown_review_javafaker;

import com.cybertek.utilities.SmartBearUtilities;
import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBearTests {

    WebDriver driver;

    @BeforeClass
    public void setupMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        SmartBearUtilities.loginToSmartBear(driver);

    }

@Test
    public void task1_login_page_links_print_test() {


    List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));
    System.out.println("Counts of all Links on the page = " + allLinks.size());

    for (WebElement eachLink : allLinks) {
        System.out.println("each Link: " + eachLink.getText());
    }
}
    @Test
    public void task2_create_order_with_javaFaker() throws InterruptedException {

        WebElement orderLink = driver.findElement(By.xpath("//a[.='Order']"));
        orderLink.click();

        Select producDropdown = new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));

        producDropdown.selectByVisibleText("FamilyAlbum");
        WebElement quantityInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
        Thread.sleep(1000);
        quantityInput.sendKeys(Keys.BACK_SPACE);
        Thread.sleep(1000);
        quantityInput.sendKeys("2");

        WebElement calculateButton = driver.findElement(By.xpath("//input[@value='Calculate']"));
        calculateButton.click();

        WebElement nameInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        WebElement streetInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
        WebElement cityInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
        WebElement stateInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4"));
        WebElement zipInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));

        Faker faker = new Faker();
        nameInput.sendKeys(faker.name().fullName());
        streetInput.sendKeys(faker.address().streetAddress());
        cityInput.sendKeys(faker.address().city());
        stateInput.sendKeys(faker.address().state());
        zipInput.sendKeys(faker.address().zipCode());

        WebElement visaSelect = driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0"));
        visaSelect.click();

        WebElement creditCardInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
        creditCardInput.sendKeys(faker.finance().creditCard().replaceAll("-",""));

        WebElement expirationInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
        expirationInput.sendKeys("12/25");

        WebElement processButton = driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton"));
        processButton.click();

        WebElement successMessage = driver.findElement(By.xpath("//strong"));
        Assert.assertTrue(successMessage.isDisplayed(),"Success Message is NOT display!");

    }







//    @Test
//    public void task1_login_page_links_print_test(){
//
//
//
//    }



}
