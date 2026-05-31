package com.selenium.test;

import com.selenium.config.Configuration;
import com.selenium.pages.CookiesPage;
import com.selenium.pages.WindowHandlePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCookieProcess extends Configuration {

    private WindowHandlePage windowhandlepage;
    private CookiesPage cookiespage;

    @BeforeClass
    public void createObject(){
        windowhandlepage = new WindowHandlePage(driver);
        cookiespage = new CookiesPage(driver);
    }

    @Test
    public void addCookie(){
        windowhandlepage.redirectPage("Cookies");
        cookiespage.addCookie("10");
    }

    @Test(dependsOnMethods = "addCookie")
    public void getAllCookie(){
        windowhandlepage.redirectPage("Cookies");
        cookiespage.getAllCookies();
    }

    @Test(dependsOnMethods = "getAllCookie")
    public void getCookie(){
        windowhandlepage.redirectPage("Cookies");
        cookiespage.getCookie("2");
    }

    @Test(dependsOnMethods = "getCookie")
    public void removeCookie(){
        windowhandlepage.redirectPage("Cookies");
        cookiespage.removeCookie("2");
    }

    @Test(dependsOnMethods = "removeCookie")
    public void deleteAllCookie(){
        windowhandlepage.redirectPage("Cookies");
        cookiespage.deleteAllCookie();
    }

}
