package org.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import static org.selenium.Actions.*;

public class firstTestCase {

    WebDriver driver;

    @BeforeSuite
    public void setWebdriver() {
        WebDriverManager.chromedriver().create();
    }

    @BeforeMethod
    public void openDriver_Website() {
        driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
    }

    @Test
    public void testcase_PerformAGoogleSearch() {

        WebElement element = findElement(driver,Locators.TextArea_Google_SearchBar);

        click(element);
        sendKeys(element,"chromedriver download");
        sendKeys(element,Keys.ENTER);

    }

    @AfterMethod
    public void close_browser() {
        driver.close();
        driver.quit();
    }
}
