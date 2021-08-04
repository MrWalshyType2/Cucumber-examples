package com.qa.example_4_simple_hooks.service;

import static org.junit.Assert.assertEquals;

import com.qa.example_4_simple_hooks.data.model.User;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserTrackerStepDefinitions {
	
	private User user;
	private Messenger messenger;
	
	public UserTrackerStepDefinitions(MessengerHooks hooks) {
		this.messenger = hooks.getMessenger();
	}

	@Given("the username {word}")
	public void theUsernameBob(String username) {
	    user = new User();
	    user.setUsername(username);
	}

	@Given("the password {word}")
	public void thePasswordWeakpass123(String password) {
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
