package com.selenium.test;

import com.selenium.config.Configuration;
import com.selenium.pages.AlertPage;
import com.selenium.pages.WindowHandlePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestAlertPopups extends Configuration {

    private AlertPage alertpage;
    private WindowHandlePage windowhandlepage;

    @BeforeClass
    public void createObject(){
        alertpage = new AlertPage(driver);
        windowhandlepage = new WindowHandlePage(driver);
    }

    @Test
    public void acceptAlert() throws InterruptedException {
        windowhandlepage.redirectPage("Alerts & Popups");
        alertpage.clickTriggerAlert();
    }

    @Test
    public void cancelAlert(){
        windowhandlepage.redirectPage("Alerts & Popups");
        alertpage.cancelAlert();
    }






}
