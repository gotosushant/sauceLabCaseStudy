package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.After;
import utils.WebDriverManager;

public class ProductPage_pageElements extends WebDriverManager{
	
	WebDriver driver = WebDriverManager.driver;
	

	//=========================== Login Page Locators ============================
	
	public By loginPage_HeaderText_className  = By.className("login_logo");
	
	
	
	
	
	//============================= End of Locators ==============================
	
	
	
	//=========================== Login Page Methods ============================
	
	public boolean verifyProductPageURL() {
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.saucedemo.com/inventory.html";
		
		if(!actualURL.equalsIgnoreCase(expectedURL)) {
			return false;
		}
		
		return true;
	}
	
	
		
	//============================= End of Methods ==============================
	
}
