package com.selenium.test;

import com.selenium.config.Configuration;
import com.selenium.pages.FileUploadPage;
import com.selenium.pages.WindowHandlePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestFileUploadAndDownloads extends Configuration {

    private WindowHandlePage windowhandlepage;
    private FileUploadPage fileuploadpage;

    @BeforeClass
    public void createObject(){
        windowhandlepage = new WindowHandlePage(driver);
        fileuploadpage = new FileUploadPage(driver);
    }

    @Test
    public void uploadFile(){
        windowhandlepage.redirectPage("File Upload");
        fileuploadpage.uploadFile("filePath");
    }

    @Test(enabled = false)
    public void downloadFile(){
        windowhandlepage.redirectPage("File Upload");
        fileuploadpage.downloadFile();
    }
}
