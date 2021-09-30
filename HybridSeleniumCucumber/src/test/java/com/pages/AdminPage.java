package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.Library;


public class AdminPage extends Library {
	@FindBy(xpath="//*[@id=\'menu_admin_viewAdminModule\']/b")
	WebElement Admin ;
    @FindBy(xpath=" //*[@id='btnAdd']")
    WebElement add;
    @FindBy(xpath="//*[@id=\'systemUser_userType\']")
    WebElement role;
    @FindBy(xpath="//*[@id='systemUser_employeeName_empName']")
    WebElement emp ;
    @FindBy(xpath="//*[@id=\'systemUser_userName\']")
    WebElement user ;
    @FindBy(xpath="//*[@id='systemUser_status']")
    WebElement status;
    @FindBy(xpath="//*[@id=\'systemUser_password\']")
    WebElement pswd ;
    @FindBy(xpath="//*[@id=\"systemUser_confirmPassword\"]")
    WebElement cpswd ;
    @FindBy(xpath="//*[@id=\'btnSave\']")
    WebElement save ;
  
    
   
  
   

}
//}


