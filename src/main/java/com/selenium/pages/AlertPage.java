package com.selenium.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPage {

    WebDriver driver;

    public AlertPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[text()='Trigger Alert']")
    WebElement triggerAlert;

    @FindBy(xpath = "//button[text()='Trigger Confirm']")
    WebElement triggerConfirm;

    @FindBy(xpath = "//button[text()='Trigger Prompt']")
    WebElement triggerPrompt;

    public void clickTriggerAlert() throws InterruptedException {
        triggerAlert.click();
        Alert alert = driver.switchTo().alert();
        String msg = alert.getText();
        System.out.println(msg);
        alert.accept();
    }

    public void cancelAlert(){
        triggerConfirm.click();
        Alert alert = driver.switchTo().alert();
        String msg = alert.getText();
        System.out.println(msg);
        alert.dismiss();
    }

    public void inputAlert(String text){
        triggerPrompt.click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(text);
        alert.accept();
    }
}
