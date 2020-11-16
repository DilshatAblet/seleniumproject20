package com.cybertek.Tasks.day11;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Double_Click_task {

    @Test
    public void DoubleClick(){

        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

        Driver.getDriver().switchTo().frame("iframeResult");

        WebElement demo  = Driver.getDriver().findElement(By.xpath("//p[@id='demo']"));
        Actions action =  new Actions(Driver.getDriver());

        action.doubleClick(demo).perform();
        Assert.assertTrue(demo.getAttribute("style").contains("red"),"Verification Fail!!");

        BrowserUtils.wait(2);
        Driver.getDriver().close();

    }


}
