package com.qa.cucumber_selenium.stepdefs;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.cucumber_selenium.SeleniumHooks;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BingStepDefs {
	
	private WebDriver driver;
	
	public BingStepDefs(SeleniumHooks hooks) {
		 this.driver = hooks.getDriver();
	}

	@When("I request www.bing.com")
	public void i_request_www_bing_com() {
	    driver.get("https://www.bing.com");
	}

	@Then("I am on the bing home page")
	public void i_am_on_the_bing_home_page() {
	    assertEquals(driver.getTitle(), "Bing");
	}

	@Given("I am on {word}")
	public void i_am_on(String url) {
	    driver.get(url);
	}

	@When("I search for {word}")
	public void i_search_for(String searchTerm) {
	    WebElement searchBar = driver.findElement(By.name("q"));
	    searchBar.sendKeys(searchTerm);
	    searchBar.submit();
	}

	@Then("the title of the page should be {string}")
	public void the_title_of_the_page_should_be(String expectedTitle) {
		String actualTitle = driver.getTitle();
	    assertEquals(expectedTitle, actualTitle);
	}
}
