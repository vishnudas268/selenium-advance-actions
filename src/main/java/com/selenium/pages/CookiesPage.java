package com.selenium.pages;

import com.selenium.utils.ReusableActions;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class CookiesPage extends ReusableActions {

    WebDriver driver;

    public CookiesPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    List<String> cookieNames = new ArrayList<>();

    public void addCookie(String cookieCount){
        for (int i = 0; i < Integer.parseInt(cookieCount); i++) {
            String cookieName = "CookieKey_" + UUID.randomUUID().toString().substring(0, 8);
            String cookieValue = "CookieValue" + UUID.randomUUID().toString().substring(0, 8);
            Cookie cookie = new Cookie(cookieName, cookieValue);
            driver.manage().addCookie(cookie);
            cookieNames.add(cookieName);
            System.out.println("Added: " + cookieName + " = " + cookieValue);
        }
    }

    public void getAllCookies(){
        Set<Cookie> all = driver.manage()
                .getCookies();
        for (Cookie ck : all) {
            System.out.println(
                    ck.getName() + " = " + ck.getValue());
        }
    }

    public void getCookie(String requiredCookieId){
        Cookie token = driver.manage()
                .getCookieNamed(cookieNames.get(Integer.parseInt(requiredCookieId)));

        System.out.println(token.getValue());
    }

    public void removeCookie(String deleteCookieIndex){
        driver.manage().deleteCookieNamed(cookieNames.get(Integer.parseInt(deleteCookieIndex)));
    }

    public void deleteAllCookie(){
        driver.manage().deleteAllCookies();
    }
}
