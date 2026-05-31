package com.selenium.test;

import com.selenium.config.Configuration;
import com.selenium.pages.IFramePage;
import com.selenium.pages.WindowHandlePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestHandleFrames extends Configuration {

    private  IFramePage iframepage;
    private  WindowHandlePage windowhandlepage;

    @BeforeClass
    public void createPageObject(){
        iframepage = new IFramePage(driver);
        windowhandlepage = new WindowHandlePage(driver);
    }

    @Test
    public void switchFrameAndFill(){
        windowhandlepage.redirectPage("Frames / iFrames");
        iframepage.switchToFrameAndFillDetails();
    }
}
