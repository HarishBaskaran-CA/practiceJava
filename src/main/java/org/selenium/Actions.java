package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Actions {

    public static WebElement findElement(WebDriver driver, By locator){
        return driver.findElement(locator);
    }

    public static void click(WebElement element){
        element.click();
    }

    public static void sendKeys(WebElement element, String value){
        element.sendKeys(value);
    }

    public static void sendKeys(WebElement element, Keys key){
        element.sendKeys(key);
    }
}
