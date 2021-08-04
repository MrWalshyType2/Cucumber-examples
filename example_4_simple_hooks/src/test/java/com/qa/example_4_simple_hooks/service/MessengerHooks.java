package com.qa.example_4_simple_hooks.service;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MessengerHooks {
	
	private Messenger messenger;

	@Before
	public void setup() {
		this.messenger = new Messenger();
	}
	
	@After
	public void teardown() {
		this.messenger.close();
	}
	
	public Messenger getMessenger() {
		return this.messenger;
	}
}

