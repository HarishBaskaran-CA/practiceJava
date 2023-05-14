package org.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.util.Set;

public class amazon_cookies {

    @Test
    public void test(){
        WebDriverManager.chromedriver().create();

        DesiredCapabilities capabilities = new DesiredCapabilities();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notification");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.amazon.in/");

        Set<Cookie> cookies = driver.manage().getCookies();
        cookies.forEach(x -> System.out.println(x.getName()));

        System.out.println(driver.manage().getCookieNamed("session-id"));


    /*
        1. ui automation
            1. login operation
            2. cookie - extract the session token
            3. store it in a java variable
            4. close ui automation
        2. BE automation
            1. use the stored token
            2. trigger api calls
     */

    }
}
