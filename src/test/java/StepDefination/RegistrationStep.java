package StepDefination;

import com.Guru.BaseLayer.BaseClass;

import io.cucumber.java.en.Given;

public class RegistrationStep extends BaseClass {
	
	@Given("user open guruApplication in {string} browser")
	public void user_open_guru_application_in_browser(String browserName) {
		
		BaseClass.initialization(browserName);
	   

}
}
