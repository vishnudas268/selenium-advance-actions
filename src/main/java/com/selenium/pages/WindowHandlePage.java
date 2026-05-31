package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class WindowHandlePage {

    WebDriver driver;
    private String parent;

    public WindowHandlePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void redirectPage(String pageName){
        driver.findElement(By.xpath("//button[text()='"+pageName+"']")).click();
    }



    public void getParent(){
        parent = driver.getWindowHandle();
        System.out.println(parent);
    }

    public void openNewTab() throws InterruptedException {
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://google.com");
    }

    public void openNewTabAndSwitchToNew(){
        Set<String> handles = driver.getWindowHandles();
        System.out.println(handles);
        for(String handle:handles){
            if(!handle.equals(parent)){
                driver.switchTo().window(handle);
                System.out.println("Switched to: "
                        + driver.getTitle());
            }
        }
    }

    public void closingCurrentWindow(){
        driver.close();
    }

    public void switchToMain(){
        driver.switchTo().window(parent);
        System.out.println(driver.getTitle());
    }
}
