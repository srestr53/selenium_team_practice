package com.cydeo.page;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CRM_Home_Page {

    public CRM_Home_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user-block")
    public WebElement dropdown;

    @FindBy(xpath = "//span[@class='menu-popup-item-text']")
    public List<WebElement> dropdownList;




}
