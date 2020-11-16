package com.cybertek.utilities;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {

    public static List<String> getElementsText(List<WebElement> list){

        List<String> webElementAsString = new ArrayList<>();

        for (WebElement each : list) {
           webElementAsString.add(each.getText());

        }
        return webElementAsString;
    }

    public static void wait(int sec){
        try {
            Thread.sleep(1000*sec);
        } catch (InterruptedException e) {
            System.out.println("Interrupted exeption ");
        }

    }

}

