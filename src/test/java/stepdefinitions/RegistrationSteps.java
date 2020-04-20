package stepdefinitions;


import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.CucumberHooks;
import utilities.ReusableComponents; 

public class RegistrationSteps 
{
 
  WebDriver driver=CucumberHooks.driver();
	
	
		
	@Given("^I am in (.*)$")
	public void i_am_in_automation_page(String pagetitle) throws IOException, ParseException{ 
		
		System.out.println("this is getting printed from @Given");

		String value=ReusableComponents.readJSONValue("FirstName");
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.name("firstName")).sendKeys(value);
		
		
	}

	@When("^I will enter (.*) and (.*) (.*) (.*)$")
	public void i_will_enter_name_and_description(String name,String lastname, String phone, String email) throws IOException, ParseException{
		
		System.out.println("this is getting printed from @When");
		
		String value=ReusableComponents.readJSONValue(lastname);
		driver.findElement(By.name("lastName")).sendKeys(value);
		
		String value2=ReusableComponents.readJSONArrayData(phone, "phonenumber");
		driver.findElement(By.name("phone")).sendKeys(value2);
	}

	@Then("^I will click on submit button$")
	public void i_will_click_on_submit_button() throws Throwable {
		
		System.out.println("this is getting printed from @Then");
		
		String value2=ReusableComponents.readJSONArrayData("eContact", "email");
		driver.findElement(By.name("userName")).sendKeys(value2);
		  
 
	}
	
}
