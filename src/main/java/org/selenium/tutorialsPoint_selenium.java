package org.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.time.Duration;

public class tutorialsPoint_selenium {

    @Test
    public void test(){
        WebDriverManager.chromedriver().create();

        DesiredCapabilities capabilities = new DesiredCapabilities();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notification");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.tutorialspoint.com/scroll-element-into-view-with-selenium");
        WebElement element = driver.findElement(By.xpath("//h2[text()='Output']"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", element);

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ALT).build().perform();
        actions.sendKeys(Keys.ALT).sendKeys(Keys.ENTER).build().perform();

    }
}
