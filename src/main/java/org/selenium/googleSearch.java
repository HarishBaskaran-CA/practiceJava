package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class googleSearch {

    @FindBy(xpath = "//textarea[@title]")
    WebElement googleInput;

    @FindBy(xpath = "//input[@aria-label]")
    WebElement searchButton;

    public googleSearch(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void serachforaninput(String value){
       //df    ---- selenide remove
        googleInput.click();
        googleInput.sendKeys(value);
        searchButton.click();
    }

    @Test
    public void test_1(){
        serachforaninput("selenium documentation");
    }
}
