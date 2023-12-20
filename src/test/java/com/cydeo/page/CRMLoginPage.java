package com.cydeo.page;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRMLoginPage {

    public CRMLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (xpath = "")
    public WebElement username;


}
