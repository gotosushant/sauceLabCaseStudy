package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.After;
import utils.WebDriverManager;

public class LoginPage_pageElements extends WebDriverManager{
	
	WebDriver driver = WebDriverManager.driver;
	

	//=========================== Login Page Locators ============================
	
	public By loginPage_HeaderText_className  = By.className("login_logo");
	public By loginPage_LoginButton_id = By.id("login-button");
	public By loginPage_UsernameTextBox_id = By.id("user-name");
	public By loginPage_PasswordTextBox_id = By.id("password");
	
	
	//============================= End of Locators ==============================
	
	
	
	//=========================== Login Page Methods ============================
	
	public void navigateToApplicationLoginPage() {
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	
	public boolean ensureThatLoginPageIsDisplayed() {
		WebElement loginPageHeader = driver.findElement(loginPage_HeaderText_className);
		WebElement loginPageLoginButton = driver.findElement(loginPage_LoginButton_id);
		
		
		//verify login page header and text
		if(!loginPageHeader.isDisplayed()) {
			return false;
		}
		else if(!loginPageHeader.getText().equalsIgnoreCase("Swag Labs")) {
			return false;
		}
		
		//verify login page login button
		if(!loginPageLoginButton.isDisplayed()) {
			return false;
		}	
		
		if(!loginPageLoginButton.isEnabled()) {
			return false;
		}	
		
	return true;
	}
	
	public boolean ensureLoginPageUIElements() {
		
		if(!ensureThatLoginPageIsDisplayed()) {
			return false;
		}
		if(!ensureWebElementIsVisible(loginPage_UsernameTextBox_id)) {
			return false;
		}
		if(!ensureWebElementIsVisible(loginPage_PasswordTextBox_id)) {
			return false;
		}
		
		return true;
	}
	
	public boolean ensureWebElementIsVisible(By locator) {
		
		WebElement eleUnderTest = driver.findElement(locator);
		if(!eleUnderTest.isDisplayed()) {
			return false;
		}		
		return true;
	}
	
	public boolean ensureWebElementIsActive(By locator) {
		
		WebElement eleUnderTest = driver.findElement(locator);
		if(!eleUnderTest.isEnabled()) {
			return false;
		}		
		return true;
	}
	
	public void enterTextInField(By field, String text) {
		driver.findElement(field).sendKeys(text);				
	}
	
	public void enterUserName(String userName) throws InterruptedException {
		//loginPage_UsernameTextBox_id
		enterTextInField(loginPage_UsernameTextBox_id, userName);
		
	}
	
	public void enterPassword(String password) throws InterruptedException {
		enterTextInField(loginPage_PasswordTextBox_id, password);
	}
	
	public void clickOnLoginButton() throws InterruptedException {
		driver.findElement(loginPage_LoginButton_id).click();
	}
	
	public boolean ensureProductPageIsDiaplayed() {
		
		ProductPage_pageElements prodPageEle = new ProductPage_pageElements();
		
		if(!prodPageEle.verifyProductPageURL()) {
			return false;
		}
		
		System.out.println("Prod page URL verified successfully!!");
		return true;
	}
		
	//============================= End of Methods ==============================
	
}
