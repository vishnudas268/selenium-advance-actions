package com.selenium.pages;

import com.selenium.utils.ReusableActions;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WaitPage extends ReusableActions {

    WebDriver driver;

    public WaitPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[text()='Explicit Wait (3s)']")
    WebElement explicitBtn;

    @FindBy(xpath = "//button[text()='Fluent Wait (5s)']")
    WebElement fluentWaitBtn;

    @FindBy(xpath = "//button[text()='Simulate Timeout']")
    WebElement simulateWaitBtn;

    @FindBy(id = "wait-target")
    WebElement targetElement;

    public void explicitWait(){
        explicitBtn.click();
        initiateExplicitWait(targetElement);
    }

    public void fluentWait(){
        fluentWaitBtn.click();
        initiateFluentWait(By.id("wait-target"));
    }

    public void simulateWait(){
        simulateWaitBtn.click();
        try {
            initiateExplicitWait(targetElement);
        } catch (TimeoutException e) {
            System.out.println("Element did not appear within 5 seconds");
        }
    }
}

