package simple_StepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Simple_SteoDef {

	
	@Given("^user has a background$")
	public void user_has_a_background() throws Throwable {
	   
	   System.out.println("Hello there");
	}

	@Given("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
	   
	   System.out.println("user is on the home page ");
	}

	@When("^user clicks on  sign in$")
	public void user_clicks_on_sign_in() throws Throwable {
	   
	   
	}

	@When("^user enters valid user name and password$")
	public void user_enters_valid_user_name_and_password() throws Throwable {
	   
	   
	}

	@When("^user click on sign in button$")
	public void user_click_on_sign_in_button() throws Throwable {
	   
	   
	}

	@Then("^user successfully login to the account$")
	public void user_successfully_login_to_the_account() throws Throwable {
	   
	   
	}
}
