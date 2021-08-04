package com.qa.example_5_tags.service;

import java.util.List;

import com.qa.example_5_tags.data.model.User;

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
	
	public List<User> close() {
		List<User> copyToReturn = activeUserTracker.close();
		activeUserTracker = null;
		
		return copyToReturn;
	}
}

