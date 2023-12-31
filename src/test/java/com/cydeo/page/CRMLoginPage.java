package com.cydeo.page;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRMLoginPage {

    public CRMLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (name = "USER_LOGIN")
    public WebElement username;
    @FindBy (name = "USER_PASSWORD")
    public WebElement password;

    @FindBy(css = "input.login-btn")
    public WebElement loginButton;


}
