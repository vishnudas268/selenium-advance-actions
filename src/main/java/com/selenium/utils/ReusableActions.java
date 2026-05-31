package com.selenium.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ReusableActions {

    WebDriver driver;

    public ReusableActions(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }

    public void initiateHoverActions(WebElement ele){
        Actions action = new Actions(driver);
        action.moveToElement(ele).perform();
        action.doubleClick(ele).perform();
        action.contextClick(ele).perform();
    }

    public void initiateDragAndDrop(WebElement src,WebElement des){
        Actions action = new Actions(driver);
        action.dragAndDrop(src,des).perform();
    }

    public void initiateExplicitWait(WebElement ele){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(6));
        wait.until(ExpectedConditions.visibilityOf(ele));
    }

    public void initiateFluentWait(By ele){
        Wait<WebDriver> fluent;
        fluent = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class);

        WebElement found = fluent.until(d -> d.findElement(ele));
    }
}


