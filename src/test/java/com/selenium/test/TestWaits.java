package com.selenium.test;

import com.selenium.config.Configuration;
import com.selenium.pages.WaitPage;
import com.selenium.pages.WindowHandlePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestWaits extends Configuration {

    private WindowHandlePage windowhandlepage;
    private WaitPage waitpage;

    @BeforeClass
    public void objectCreation(){
        windowhandlepage = new WindowHandlePage(driver);
        waitpage = new WaitPage(driver);
    }

    @Test
    public void testExplicitWait(){
        windowhandlepage.redirectPage("Waits");
        waitpage.explicitWait();
    }

    @Test
    public void testFluentWait(){
        windowhandlepage.redirectPage("Waits");
        waitpage.fluentWait();
    }

    @Test
    public void testSimulateWait(){
        windowhandlepage.redirectPage("Waits");
        waitpage.simulateWait();
    }


}
