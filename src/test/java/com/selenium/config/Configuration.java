package com.selenium.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Configuration {

    public WebDriver driver;

    @BeforeTest
    public void openWebsite(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:3000/automation/selenium-practice");
    }

    @AfterTest
    public void dearDown(){
        driver.close();
        driver.quit();

    }
}
