package com.Guru.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Guru.BaseLayer.BaseClass;
import com.Guru.UtilityLayer.DropDownHelper;
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
 
 @FindBy(name="address1")
 private WebElement address;
 
 @FindBy(name="city")
 private WebElement city;
 
 @FindBy(name="state")
 private WebElement state;
 
 @FindBy(name="postalCode")
 private WebElement postalCode;
 
 @FindBy(name="country")
 private WebElement country;
 
 
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
	
 public void validatePhone(String Phone)
 {
	 WebElementHelper.senKeys(phone, Phone);
 }

 public void validateEmail(String Email)
 {
	 WebElementHelper.senKeys(email, Email);
 }
 
 public void validateAddress(String Address)
 {
	 WebElementHelper.senKeys(address, Address);
 }
 

 public void validateCity(String City)
 {
	 WebElementHelper.senKeys(city, City);
 }
 
 public void validateState(String State)
 {
	 WebElementHelper.senKeys(state, State); 
 }
 

 public void validatePostalCode(String PostalCode)
 {
	 WebElementHelper.senKeys(postalCode, PostalCode);
 }
 

 public void validateCountry(String Country)
 {
	 DropDownHelper.handleDropDown(country, Country);
 }
 
}
