package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepCRM {

	WebDriver driver;
	
	@Given("^User already in login page$")
	public void user_already_in_login_page() throws Throwable {
	   
	   driver = new FirefoxDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.freeCRM.com");
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() throws Throwable {
	   
	  String title=driver.getTitle();
	  System.out.println(title);
	}

	@Then("^user enter username and password$")
	public void user_enter_username_and_password() throws Throwable {
	   
	   driver.findElement(By.name("username")).sendKeys("naveenk");
	   driver.findElement(By.name("password")).sendKeys("test@123");
	}
	@Then("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
	   
		WebElement loginbtn=driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",loginbtn);
	}
	    
	@Then("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
	   
		String title= driver.getTitle(); 
		 System.out.println("Homepage::" +title);
		 Assert.assertEquals("CRMPRO", title);;
	}



}
