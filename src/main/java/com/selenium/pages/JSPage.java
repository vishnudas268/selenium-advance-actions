package com.selenium.pages;

import com.selenium.utils.ReusableActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JSPage extends ReusableActions {

    WebDriver driver;
    JavascriptExecutor js;


    public JSPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        this.js = (JavascriptExecutor) driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "hidden-btn")
    WebElement hiddenBtn;

    @FindBy(xpath = "//textarea")
    WebElement inputField;

    public void scrollToBottom(){
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    public void clickHiddenElement(){
        js.executeScript("arguments[0].click();", hiddenBtn);
    }

    public void getPageTitle(){
        String title = (String) js.executeScript(
                "return document.title;");
        System.out.println(title);
    }

    public void inputValue(String inputValue){
        inputField.clear();
        js.executeScript(
                "arguments[0].value='"+inputValue+"';", inputField);
    }

    public void highLightElement(){
        js.executeScript(
                "arguments[0].style.border='2px solid red'",
                inputField);
    }

    public void pageZoom(){
        js.executeScript(
                "document.body.style.zoom='1.5'");
    }
}
