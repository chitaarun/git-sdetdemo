package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {

	
	WebDriver driver;
	
	@Given("^Open firefox  and start application$")
	public void open_firefox_and_start_application() throws Throwable {
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com");
	    
	}

	@When("^I enter valid username and valid password$")
	public void i_enter_valid_username_and_valid_password() throws Throwable {
	   driver.findElement(By.name("email")).sendKeys("das.arun70@yahoo.com");
	   driver.findElement(By.name("pass")).sendKeys("Darby@1");
	}

	@Then("^User should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
	    driver.findElement(By.id("loginbutton")).click();
	}

}
