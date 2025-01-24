package StepDefination;

import org.testng.Assert;

import com.Guru.BaseLayer.BaseClass;
import com.Guru.PageLayer.RegistrationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegistrationStep extends BaseClass {
	
	static RegistrationPage reg;
	
	@Given("user open guruApplication in {string} browser")
	public void user_open_guru_application_in_browser(String browserName) {
		
		BaseClass.initialization(browserName);
	  
}
	
	@When("user validate url")
	public void user_validate_url() {
	  
		String url=getDriver().getCurrentUrl();
		
		Assert.assertEquals(url.contains("newtours"), true);
	}
	@When("user validate title")
	public void user_validate_title() {
	    
		String title=getDriver().getTitle();
		
		Assert.assertEquals(title.contains("Tours"), true);
	}
	

@When("user should enter valid firstname as {string}")
public void user_should_enter_valid_firstname_as(String Fname) {
	
	 reg = new RegistrationPage();
	 reg.validateFname(Fname);
  
}
@When("user should enter valid LastName as {string}")
public void user_should_enter_valid_last_name_as(String Lname) {
	
	reg = new RegistrationPage();
	 reg.validatelname(Lname);
   
}


@When("user should enter valid Phone as {string}")
public void user_should_enter_valid_phone_as(String Phone) {
    
	reg = new RegistrationPage();
	
	reg.validatePhone(Phone);
	
}
@When("user should enter valid Email as {string}")
public void user_should_enter_valid_email_as(String Email) {

	reg = new RegistrationPage();
	
	reg.validateEmail(Email);
}


@When("user should enter valid address as {string}")
public void user_should_enter_valid_address_as(String Address) {
    
}
@When("user should enter valid city as {string}")
public void user_should_enter_valid_city_as(String City) {
   
}
@When("user should enter valid state as {string}")
public void user_should_enter_valid_state_as(String State) {
   
}
@When("user should enter valid Postal Code as {string}")
public void user_should_enter_valid_postal_code_as(String PCode) {
   
}
@When("user should enter valid country as {string}")
public void user_should_enter_valid_country_as(String country) {
   
}

}
