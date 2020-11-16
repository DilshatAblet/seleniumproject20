package com.cybertek.Tasks.day11;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Hover_Over_Test {

    @Test
    public void hoverOver(){

        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        BrowserUtils.wait(2);

        WebElement acceptCookiesButton = Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        acceptCookiesButton.click();
        WebElement  smallCircle = Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));
        WebElement bigCircle = Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));


        Actions action = new Actions(Driver.getDriver());
        BrowserUtils.wait(2);
        action.dragAndDrop(smallCircle,bigCircle).perform();


        Assert.assertTrue(bigCircle.getText().contains("You did great!"),"Verification FAILED !");

        BrowserUtils.wait(2);
        Driver.closeDriver();


    }
}
