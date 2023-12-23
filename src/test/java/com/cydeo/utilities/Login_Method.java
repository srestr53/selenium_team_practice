package com.cydeo.utilities;

import com.cydeo.page.CRMLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login_Method {

    public static void login_method(){

        Driver.getDriver().get(ConfigurationReader.getProperty("envURL"));

        CRMLoginPage crm = new CRMLoginPage();
        crm.username.sendKeys(ConfigurationReader.getProperty("fusername"));
        crm.password.sendKeys(ConfigurationReader.getProperty("fpassword"));
        crm.loginButton.click();



   }
}
