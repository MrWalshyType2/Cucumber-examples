package com.qa.example_3_cucumber_expressions.service;

import static org.junit.Assert.assertEquals;

import com.qa.example_3_cucumber_expressions.data.model.User;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserTrackerStepDefinitions {
	
	private User user;
	private Messenger messenger = new Messenger();

	@Given("the username {word}")
	public void theUsername(String username) {
	    user = new User();
	    user.setUsername(username);
	}

	@Given("the password {word}")
	public void thePassword(String password) {
	    user.setPassword(password);
	}

	@Given("the user id of {int}")
	public void theUserIdOf(Integer id) {
	    user.setId(id);
	}

	@When("the user logs in")
	public void theUserLogsIn() {
	    messenger.login(user);
	}

	@Then("the user with the id {int} should be in the active user tracker")
	public void theUserWithTheIdShouldBeInTheActiveUserTracker(Integer id) {
	    assertEquals(messenger.getActiveUser(id), user);
	}
	
}
