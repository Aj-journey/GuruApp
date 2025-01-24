package com.Guru.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Guru.BaseLayer.BaseClass;
import com.Guru.UtilityLayer.WebElementHelper;

public class RegistrationPage extends BaseClass {

	 @FindBy(xpath="//a[text()='REGISTER']")
	 private WebElement reg;	
	
 @FindBy(name="firstName")
 private WebElement fname;
 
 @FindBy(name="lastName")
 private WebElement lname;
 
 @FindBy(name="phone")
 private WebElement phone;
 
 @FindBy(name="userName")
 private WebElement email;
 
 
 public RegistrationPage()
 {
	 PageFactory.initElements(getDriver(), this);
 }
 
 public void validateFname(String Fname)
 {
	 WebElementHelper.click(reg);
	 WebElementHelper.senKeys(fname, Fname);
 }
 
 public void validatelname(String Lname)
 {
	 WebElementHelper.senKeys(lname, Lname);
 }
	

}
