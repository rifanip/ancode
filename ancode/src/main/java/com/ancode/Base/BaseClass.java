package com.ancode.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseClass {
    public static WebDriver webDriver;

    public BaseClass(WebDriver webDriver){
        com.ancode.Base.BaseClass.webDriver = webDriver;
    }

    public void input(WebElement webElement, String text){
        webElement.sendKeys(text);
    }

    public void click(WebElement webElement){
        webElement.click();
    }

    public void select(WebElement webElement){
        webElement.isSelected();
    }
}
