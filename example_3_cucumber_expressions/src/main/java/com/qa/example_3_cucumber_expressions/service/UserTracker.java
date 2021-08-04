package com.qa.example_3_cucumber_expressions.service;

import java.util.ArrayList;
import java.util.List;

import com.qa.example_3_cucumber_expressions.data.model.User;

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

}
