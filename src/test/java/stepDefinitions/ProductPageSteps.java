package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage_pageElements;
import pages.ProductPage_pageElements;


public class ProductPageSteps extends ProductPage_pageElements{
	
		
	@Given("I am at the Product page as userName {string} and password {string}")
	public void i_am_at_the_product_page_as_user_name_and_password(String userName, String password) throws InterruptedException {
	   
		LoginPage_pageElements lpe = new LoginPage_pageElements();
		
		//navigate to the application
		lpe.navigateToApplicationLoginPage();
		
		//login to the application
		lpe.enterUserName(userName);
		lpe.enterPassword(password);
		lpe.clickOnLoginButton();
	}

}
