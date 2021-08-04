Feature: User tracker works

  As a user, I want my login to be tracked, so the system can notify others when I am online.
  
  Scenario: User successfully added to tracker upon login
  	Given the username Bob
  	And the password weakpass123
  	And the user id of 543
  	When the user logs in
  	Then the user with the id 543 should be in the active user tracker