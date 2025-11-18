package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage_pageElements;


public class LoginPageSteps extends LoginPage_pageElements{
	
	//LoginPage_pageElements lpe = new LoginPage_pageElements();	
	
	@Given("I navigate to the login page")
	public void i_navigate_to_the_login_page() {
	    navigateToApplicationLoginPage();
	    Assert.assertTrue(ensureThatLoginPageIsDisplayed());		
	}

	@Then("Login page UI elements should be proper")
	public void login_page_ui_elements_should_be_proper() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(ensureLoginPageUIElements());
	}
	
	@When("I enter the username {string} and password {string}")
	public void i_enter_the_username_and_password(String usName, String password) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		enterUserName(usName);
		enterPassword(password);
		clickOnLoginButton();
	}

	@Then("I should be able to login successfully")
	public void i_should_be_able_to_login_successfully() {
	    Assert.assertTrue(ensureProductPageIsDiaplayed());
	}

}
