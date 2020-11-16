package com.cybertek.Tasks.day02_task;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class task4 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");

        WebElement addElementButton = driver.findElement(By.cssSelector("#content > div > button"));
        addElementButton.click();

        WebElement deleteButton = driver.findElement(By.xpath("//*[@id=\"elements\"]/button"));
        if(deleteButton.isDisplayed()) System.out.println("Delete Button is Displayed");
        else System.out.println("Delete Button is Not Displayed");

        System.out.println("========================");

        deleteButton.click();
        try {
            driver.findElement(By.xpath("//*[@id=\"elements\"]/button")).isDisplayed();
            System.out.println("Delete Button still displayed after clicking");
        }catch (NoSuchElementException e){
            System.out.println("Delete Button is Not Displayed after clicking");
        }

























    }
}
