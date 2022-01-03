package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
   
    
	WebDriver driver;
	
	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
	    System.setProperty("webdriver.chrome.driver", "F:\\TECH-SOFT\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	    driver.getCurrentUrl();
	    String title=driver.getTitle();
	    System.out.println(title);
	}

	@When("User enters username")
	public void user_enters_username() {
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  
	}

	@Then("User enters password")
	public void user_enters_password() {
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	
	}

	@Then("Clicks on login button")
	public void clicks_on_login_button() {
		
		driver.findElement(By.id("btnLogin")).click();
	    
	
	}


	}

	
	



