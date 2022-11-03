package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Given - user is on login page");
	}

	@When("user enters username and passowrd")
	public void user_enters_username_and_passowrd() {
		System.out.println("When - User enters username and password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("When - User clicks on login button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("Then - User is navigated to home page");
	}
}
