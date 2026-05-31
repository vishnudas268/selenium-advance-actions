package com.selenium.test;

import com.selenium.config.Configuration;
import com.selenium.pages.WindowHandlePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestWindowHandles extends Configuration {

    private WindowHandlePage windowhandlepage;

    @BeforeClass
    public void createPageObject(){
        windowhandlepage = new WindowHandlePage(driver);
    }

    @Test(enabled = false)
    public void checkWindowHandles(){
        windowhandlepage.getParent();
    }

    @Test(enabled = false)
    public void testOpenNewTab() throws InterruptedException {
        windowhandlepage.openNewTab();
    }

    @Test
    public void testOpenNewWindowAndSwitchToNew() throws InterruptedException {
        windowhandlepage.getParent();
        windowhandlepage.openNewTab();
        windowhandlepage.openNewTabAndSwitchToNew();
        windowhandlepage.closingCurrentWindow();
        windowhandlepage.switchToMain();

    }


}
