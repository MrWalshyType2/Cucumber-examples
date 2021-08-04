package com.qa.example_3_cucumber_expressions.service;

import com.qa.example_3_cucumber_expressions.data.model.User;

public class Messenger {
	
	private UserTracker activeUserTracker;
	
	public Messenger() {
		this.activeUserTracker = new UserTracker();
	}
	
	public boolean login(User user) {
		boolean success = login(user.getUsername(), user.getPassword());
		
		if (success) {
			activeUserTracker.addUser(user);
			return success;
		}
		return false;
	}

	private boolean login(String username, String password) {
		// calls login service and authenticates
		return true;
	}

	public User getActiveUser(int id) {
		return activeUserTracker.getUser(id);
	}
}

