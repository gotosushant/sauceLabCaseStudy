package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import utils.WebDriverManager;

public class Hooks {
	
	public WebDriver driver;
	

	@Before
	public void addingBeforeScenario() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");		
		
		driver = new ChromeDriver(options);
		WebDriverManager.driver = driver;
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@After
	public void afterEachScenario() {
		System.out.println("Executing hooks after scenario");
		driver.quit();
	}
}
