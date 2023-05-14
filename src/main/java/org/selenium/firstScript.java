package org.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.*;

public class firstScript {

    @Parameters("chrome")
    @BeforeSuite
    public void BeforeSuite( String browser) {
        System.out.println("BeforeSuite");
    }
    @BeforeTest
    public void BeforeTest() {
        System.out.println("BeforeTest");
    }
    @BeforeClass
    public void BeforeClass() {
        System.out.println("BeforeClass");
    }


    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
        WebDriverManager.chromedriver().create();
    }

    /*
    always run
    dependson method
    dependson group
    invocation count
    priority
     */

    @Test
    public void zeroCase () {
        @FindBy("")
        WebElement input;
    }

    @Test(alwaysRun = true, groups = "regression", priority = 2)
    public void FirstTest() {
//        System.setProperty("webdriver.chrome.driver","path to chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
        String title = driver.getTitle();

        // Verify
        Assert.assertEquals(true,title.contains("Selenium WebDriver"));

    }

    @Test(groups = "sanity", priority = 1)
    public void secondTest() {
        System.out.println("Second Test");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

    @AfterClass
    public void AfterClass() {
        System.out.println("AfterClass");
    }
    @AfterTest
    public void AfterTest() {
        System.out.println("AfterTest");
    }
    @AfterSuite
    public void AfterSuite() {
        System.out.println("AfterSuite");
    }
}
