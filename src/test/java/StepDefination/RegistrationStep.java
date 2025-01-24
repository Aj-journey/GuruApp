package StepDefination;

import org.testng.Assert;

import com.Guru.BaseLayer.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegistrationStep extends BaseClass {
	
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

}
