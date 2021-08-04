package com.qa.example_4_simple_hooks.service;

import java.util.ArrayList;
import java.util.List;

import com.qa.example_4_simple_hooks.data.model.User;

public class UserTracker {
	
	private List<User> users;
	
	public UserTracker() {
		users = new ArrayList<User>();
	}

	public void addUser(User user) {
		users.add(user);
	}

	public User getUser(int id) {
		return users.stream()
				    .filter(user -> user.getId() == id)
				    .findFirst()
				    .orElseThrow();
	}

	public List<User> getUsers() {
		return users;
	}

	public List<User> close() {
		List<User> copyToReturn = users;
		users = null;
		
		return copyToReturn;
	}

}
