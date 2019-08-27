package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo {
static	WebDriver driver;
	@Given("user enter the guru{int} demo site url")
	public void user_enter_the_guru_demo_site_url(Integer int1) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dr.Kamaraj\\eclipse-workspace\\Guru99\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/addcustomer.php");
	    
	}

	@When("user clicking on  the background check option and entering the billing details")
	public void user_clicking_on_the_background_check_option_and_entering_the_billing_details(io.cucumber.datatable.DataTable datas) {
		
	   
	}

	@Then("user clicking the submit button")
	public void user_clicking_the_submit_button() {
	   
	}

	@When("user clicking on the background check option and entering the billing details")
	public void user_clicking_on_the_background_check_option_and_entering_the_billing_details() {
	}

	@Then("user entering {string}, {string}, {string}, {string}, {string}")
	public void user_entering(String string, String string2, String string3, String string4, String string5) {
	   
	}

	@Then("clicking the submit button")
	public void clicking_the_submit_button() {
	   
	}




}
