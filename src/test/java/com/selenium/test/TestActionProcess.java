package com.selenium.test;

import com.selenium.config.Configuration;
import com.selenium.pages.ActionsPage;
import com.selenium.pages.WindowHandlePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActionProcess extends Configuration {

    private WindowHandlePage windowhandlepage;
    private ActionsPage actionspage;

    @BeforeClass
    public void createObject(){
        windowhandlepage = new WindowHandlePage(driver);
        actionspage = new ActionsPage(driver);
    }

    @Test
    public void hoverTheElement(){
        windowhandlepage.redirectPage("Actions Class");
        actionspage.hoverElement();
    }

    @Test
    public void dragAndDrop(){
        windowhandlepage.redirectPage("Actions Class");
        actionspage.DragAndDrop();
    }

}
