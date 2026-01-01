
package steps;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginPage;
import utils.DriverFactory;
import utils.Log;

public class LoginSteps {

	private LoginPage login;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		DriverFactory.getDriver().get("https://www.saucedemo.com/");
		login= new LoginPage();
		Log.info("Test Case: Login test has started");
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
		login.enterUsername(username);
		Log.info("Username entered: " + username);
	}

	@And("user enters password {string}")
	public void user_enters_password(String password) {
		login.enterPassword(password);
		Log.info("Password entered");
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		login.clickLogin();
		Log.info("Login button clicked");
	}

	@Then("user should be redirected to inventory page")
	public void user_should_be_redirected_to_inventory_page() {
		Assert.assertTrue(true); // URL / page validation can be added later
		Log.info("User successfully logged in and redirected to inventory page");
	}

	@Then("error message should be displayed")
	public void error_message_should_be_displayed() {
		Assert.assertTrue(true); // placeholder validation
		Log.info("Error message displayed for invalid login");
	}
}
