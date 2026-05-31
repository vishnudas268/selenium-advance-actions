package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IFramePage {

    WebDriver driver;

    public IFramePage(WebDriver driver){
        this.driver= driver;
    }

    public void switchToFrameAndFillDetails(){
        driver.switchTo().frame("practice-frame");
        WebElement frameInput=driver.findElement(By.id("frame-input"));
        frameInput.sendKeys("Hello World!");
        driver.switchTo().defaultContent();
        driver.switchTo().parentFrame();
    }

}
