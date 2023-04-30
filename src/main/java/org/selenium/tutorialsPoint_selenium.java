package org.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class tutorialsPoint_selenium {

    @Test
    public void test(){
        WebDriverManager.chromedriver().create();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/scroll-element-into-view-with-selenium");
        WebElement element = driver.findElement(By.xpath("//h2[text()='Output']"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", element);

    }
}
