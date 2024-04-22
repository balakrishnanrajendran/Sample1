package stepdefinition;

import java.util.List;
import java.util.Map;

import com.app.page.LoginPageexe;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageExe extends LoginPageexe{
	
	@Given("Login to the Application")
	public void login_to_the_application() {
		browserLaunch();
	   System.out.println("browserlaunch");
	}

	@When("Enter the username {string}")
	public void enter_the_username(String user) {
		username(user);
	   System.out.println(user);
	}

	@When("Enter the password {string}")
	public void enter_the_password(String pass) {
	  System.out.println(pass);
	}

	@When("Click the loginbutton")
	public void click_the_loginbutton() {
	   System.out.println("loginbutton");
	}

	@Then("Validate the Home Page")
	public void validate_the_home_page() {
	    System.out.println("homepage");
	}

	@When("Enter the invalid username {string}")
	public void enter_the_invalid_username(String string) {
	   System.out.println(string);
	}
	@When("Enter the correct password {string}")
	public void enter_the_correct_password(String string) {
	  System.out.println(string);
	}

	// List
	/*
	 * @When("Enter the invalid user") public void enter_the_invalid_user(DataTable
	 * dataTable) { List<String> asList = dataTable.asList();
	 * System.out.println(asList.get(0)); }
	 */
	
	// List
		@When("Enter the invalid user")
		public void enter_the_invalid_user(DataTable dataTable) {
			Map<String, String> asMap = dataTable.asMap();
			System.out.println(asMap.get("Name"));
		}

}
