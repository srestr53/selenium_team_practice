package com.cydeo.tests.CRM.firyuza_solution;

import com.cydeo.page.CRM_Home_Page;
import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.Login_Method;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class US_3{

    @Test
    public void us03_test1(){
        //Step #1:
        //User go to the login page.
        //Login Page URL: https://qa.bleucrm.com/stream/
        //As a User I should be able to see login page once I click on the URL.

        //Step#2:
        //User enter login and password in the fields and click login button to login to the web page
        //Login: hr1@cybertekschool.com
        //Password: UserUser
        //User should be able to login and have access to the profile.
        Login_Method.login_method();
        //Step#3:
        //On the top right corner of the page click on the drop down arrow next to your profile name.
        //User should be able to see 5 options after clicking the drop down

       CRM_Home_Page crm = new CRM_Home_Page();
       crm.dropdown.click();
       Assert.assertTrue(crm.dropdownList.size()==5);
    }
}
