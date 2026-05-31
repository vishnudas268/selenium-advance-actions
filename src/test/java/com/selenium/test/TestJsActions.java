package com.selenium.test;

import com.selenium.config.Configuration;
import com.selenium.pages.JSPage;
import com.selenium.pages.WindowHandlePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestJsActions extends Configuration {

    private WindowHandlePage windowhandlepage;
    private JSPage jspage;

    @BeforeClass
    public void createObject(){
        windowhandlepage = new WindowHandlePage(driver);
        jspage = new JSPage(driver);
    }
    @Test
    public void testScrollToBottom(){
        windowhandlepage.redirectPage("JS Executor");
        jspage.scrollToBottom();
    }

    @Test
    public void clickHiddenElement(){
        windowhandlepage.redirectPage("JS Executor");
        jspage.clickHiddenElement();
    }

    @Test
    public void testPageTitle(){
        windowhandlepage.redirectPage("JS Executor");
        jspage.getPageTitle();
    }

    @Test
    public void inputData(){
        windowhandlepage.redirectPage("JS Executor");
        jspage.inputValue("Hello World");
    }

    @Test
    public void highLightField(){
        windowhandlepage.redirectPage("JS Executor");
        jspage.highLightElement();
    }

    @Test
    public void pageZoom(){
        windowhandlepage.redirectPage("JS Executor");
        jspage.pageZoom();
    }



}
