package com.cybertek.Tasks.day04_Task;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task2_AppleWebsite_eachTitle {
    public static void main(String[] args) {

//    1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.apple.com");
//    2.Go to https://www.apple.com
//    3.Click to all of the headers one by one
//    a.Mac, iPad, iPhone, Watch, TV, Music, Support
        WebElement mac = driver.findElement(By.xpath("//*[@id=\"ac-globalnav\"]/div/ul[2]/li[2]/a"));
        mac.click(); driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        List<WebElement> macLink = driver.findElements(By.xpath("//body//a"));
        String TitleOfMac = driver.getTitle();
        int NumberOfMacLink = 0;
        int missingLinkText =0;
        int LinkHasText = 0;
        for(WebElement eachMacLink : macLink){
            NumberOfMacLink++;
            if(eachMacLink.getText().isEmpty()) missingLinkText++;
            else LinkHasText++;
        }
        driver.navigate().back();


        WebElement ipad = driver.findElement(By.xpath("//*[@id=\"ac-globalnav\"]/div/ul[2]/li[3]/a"));
        ipad.click(); driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        List<WebElement> ipadLink = driver.findElements(By.xpath("//body//a"));
        int NumberOfIpadLink = 0;
        String TitleOfIpad = driver.getTitle();
        for(WebElement eachIpadLink : ipadLink){
            NumberOfIpadLink++;
            if(eachIpadLink.getText().isEmpty()) missingLinkText++;
            else LinkHasText++;
        }
        driver.navigate().back();

        WebElement iphone = driver.findElement(By.xpath("//*[@id=\"ac-globalnav\"]/div/ul[2]/li[4]/a"));
        iphone.click(); driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        List<WebElement> iphoneLink = driver.findElements(By.xpath("//body//a"));
        int NumberOfIphoneLink = 0;
        String TitleOfIphone = driver.getTitle();
        for(WebElement eachIphoneLink : iphoneLink){
            NumberOfIphoneLink++;
            if(eachIphoneLink.getText().isEmpty()) missingLinkText++;
            else LinkHasText++;
        }
        driver.navigate().back();

        WebElement watch = driver.findElement(By.xpath("//*[@id=\"ac-globalnav\"]/div/ul[2]/li[5]/a"));
        watch.click(); driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        List<WebElement> watchLink = driver.findElements(By.xpath("//body//a"));
        int NumberOfwatchLink = 0;
        String TitleOfwatch = driver.getTitle();
        for(WebElement eachwatchLink : watchLink){
            NumberOfwatchLink++;
            if(eachwatchLink.getText().isEmpty()) missingLinkText++;
            else LinkHasText++;
        }
        driver.navigate().back();

        WebElement TV = driver.findElement(By.xpath("//*[@id=\"ac-globalnav\"]/div/ul[2]/li[6]/a"));
        TV.click(); driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        List<WebElement> TVLink = driver.findElements(By.xpath("//body//a"));
        int NumberOfTVLink = 0;
        String TitleOfTV = driver.getTitle();
        for(WebElement eachTVLink : TVLink){
            NumberOfTVLink++;
            if(eachTVLink.getText().isEmpty()) missingLinkText++;
            else LinkHasText++;
        }
        driver.navigate().back();

        WebElement music = driver.findElement(By.xpath("//*[@id=\"ac-globalnav\"]/div/ul[2]/li[7]/a"));
        music.click(); driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        List<WebElement> musicLink = driver.findElements(By.xpath("//body//a"));
        int NumberOfmusicLink = 0;
        String TitleOfMusic = driver.getTitle();
        for(WebElement eachmusicLink : musicLink){
            NumberOfmusicLink++;
            if(eachmusicLink.getText().isEmpty()) missingLinkText++;
            else LinkHasText++;
        }
        driver.navigate().back();

        WebElement support = driver.findElement(By.xpath("//*[@id=\"ac-globalnav\"]/div/ul[2]/li[8]/a"));
        support.click(); driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        List<WebElement> supportLink = driver.findElements(By.xpath("//body//a"));
        int NumberOfsupportLink = 0;
        String TitleOfSupport = driver.getTitle();
        for(WebElement eachsupportLink : supportLink){
            NumberOfsupportLink++;
            if(eachsupportLink.getText().isEmpty()) missingLinkText++;
            else LinkHasText++;
        }
        driver.navigate().back();

        System.out.println("Title of Mac is: "+TitleOfMac+"|| Number Of Links is: "+NumberOfMacLink);
        System.out.println("Title of Ipad is: "+TitleOfIpad+"|| Number Of Links is: "+NumberOfIpadLink);
        System.out.println("Title of Iphone is: "+TitleOfIphone+"|| Number Of Links is: "+NumberOfIphoneLink);
        System.out.println("Title of Watch is: "+TitleOfwatch+"|| Number Of Links is: "+NumberOfwatchLink);
        System.out.println("Title of TV is: "+TitleOfTV+"|| Number Of Links is: "+NumberOfTVLink);
        System.out.println("Title of Music is: "+TitleOfMusic+"|| Number Of Links is: "+NumberOfmusicLink);
        System.out.println("Title of Support is: "+TitleOfSupport+"|| Number Of Links is: "+NumberOfsupportLink);


        System.out.println("Number of Missing Text Link is: "+missingLinkText);
        System.out.println("Number of Link has Text is: "+LinkHasText);
        int TotalLink = NumberOfMacLink+NumberOfIpadLink+NumberOfIphoneLink+NumberOfmusicLink+NumberOfTVLink+
                NumberOfsupportLink+NumberOfwatchLink;
        System.out.println("Total Link: "+TotalLink);
//    4.Printout how many links on each page with the titles of the pages

//    5.Loop through all
//    6.Print out how many link is missing textTOTAL
//    7.Print out how many link has textTOTAL
//    8.Print out how many total linkTOTAL




    }
}
