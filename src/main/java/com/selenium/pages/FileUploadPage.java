package com.selenium.pages;

import com.selenium.utils.ReusableActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUploadPage extends ReusableActions {

    WebDriver driver;

    public FileUploadPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='file-input]")
    WebElement fileUploadField;

    public void uploadFile(String filePath){
        fileUploadField.sendKeys(filePath);
    }

    public void downloadFile(){
    }
}
