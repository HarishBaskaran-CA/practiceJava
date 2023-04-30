package org.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.selenium.Actions.*;

public class firstTestCase {

    WebDriver driver;

    @BeforeSuite
    public void setWebdriver() {
        WebDriverManager.chromedriver().create();
    }

    @BeforeMethod
    public void openDriver_Website() throws MalformedURLException {
        driver = new ChromeDriver();

//        driver = new RemoteWebDriver(new URL("http://localhost:4444"));

        driver.get("https://www.google.co.in/");
        driver.getTitle();
        driver.getCurrentUrl();

    }

    @Test
    public void testcase_PerformAGoogleSearch() {

        WebElement element = findElement(driver,Locators.TextArea_Google_SearchBar);

        driver.manage().timeouts().implicitlyWait(30, SECONDS);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='3px solid red'", element);

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

        click(element);

        // login

//        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".classlocator")));
//
//
//
//
//
//        sendKeys(element,"chromedriver download");
//        sendKeys(element,Keys.ENTER);

    }

//    @AfterMethod
    public void close_browser() {
        driver.close();
        driver.quit();
    }
}
