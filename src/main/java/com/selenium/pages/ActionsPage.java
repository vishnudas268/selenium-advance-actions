package com.selenium.pages;

import com.selenium.utils.ReusableActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActionsPage extends ReusableActions {

    WebDriver driver;

    public ActionsPage(WebDriver driver){
        super(driver);
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "hover-el")
    WebElement hoverElement;

    @FindBy(id = "drag-item")
    WebElement dragItem;

    @FindBy(id="drop-target")
    WebElement dropItem;

    public void hoverElement(){
        initiateHoverActions(hoverElement);
    }

    public void DragAndDrop(){
        initiateDragAndDrop(dragItem,dropItem);
    }


}

