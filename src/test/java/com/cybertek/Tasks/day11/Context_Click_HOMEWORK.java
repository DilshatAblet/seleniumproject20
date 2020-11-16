package com.cybertek.Tasks.day11;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Context_Click_HOMEWORK {

    @Test
    public void HOMEWORK(){

        Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");

        WebElement box = Driver.getDriver().findElement(By.xpath("//div[@id='hot-spot']"));
        BrowserUtils.wait(2);

        Actions action = new Actions(Driver.getDriver());
        action.contextClick(box).perform();
        BrowserUtils.wait(2);

        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();

        BrowserUtils.wait(3);
        Driver.getDriver().close();


    }
}
