package com.qa.example_5_tags.service;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MessengerHooks {
	
	private Messenger messenger;

	@Before("@messenger and @service")
	public void setup() {
		this.messenger = new Messenger();
	}
	
	@After("@messenger")
	public void teardown() {
		this.messenger.close();
	}
	
	public Messenger getMessenger() {
		return this.messenger;
	}
}

